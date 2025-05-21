import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.net.URLEncoder;  // Import URLEncoder

@WebServlet("/CookieServlet")
public class sixb_CookieServlet extends HttpServlet {
    int count = 0; // count for loading times

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String userName = request.getParameter("userName");

        // Step 4: Create a new cookie only if the userName is valid
        if (userName != null && !userName.isEmpty()) {
            // URL-encode the userName to avoid invalid characters
            String encodedUserName = URLEncoder.encode(userName, "UTF-8");

            // Create a new cookie with the encoded user name
            Cookie userCookie = new Cookie("user", encodedUserName);

            // Step 5: Set cookie properties
            userCookie.setMaxAge(60); // Cookie expires in 1 minute
            userCookie.setPath("/");

            // Step 6: Add cookie to response
            response.addCookie(userCookie);
        }

        // Step 7: Read existing cookies
        Cookie[] cookies = request.getCookies();
        String existingUser = null;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    // Decode the cookie value
                    existingUser = java.net.URLDecoder.decode(cookie.getValue(), "UTF-8");
                    break;
                }
            }
        }

        // Step 8: Generate HTML response
        out.println("<html>");
        out.println("<head><title>Cookie Example</title></head>");
        out.println("<body>");
        if (existingUser != null) {
            count += 1;
            out.println("<font color=blue><h2>Welcome back, " + existingUser + "!</h2></font>");
            out.println("<font color=magenta><h2>You have visited this page " + count + " times!</h2></font>");
        } else {
            out.println("<h2>Welcome Guest!</h2>");
            out.println("<form action='CookieServlet' method='get'>");
            out.println("Enter your name: <input type='text' name='userName'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
        }
        out.println("</body></html>");
    }

    // Step 10: Handle POST requests (for logout)
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Delete the cookie by setting its max age to 0
        Cookie cookie = new Cookie("user", "");
        cookie.setMaxAge(0);
        cookie.setPath("/");

        // Add the deleted cookie to the response
        response.addCookie(cookie);

        // Redirect back to the servlet
        response.sendRedirect("CookieServlet");
    }
}
