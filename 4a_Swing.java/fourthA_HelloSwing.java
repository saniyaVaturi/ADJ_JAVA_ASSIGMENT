/*4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
Programming in Blue color plain font with font size of 32 using Jframe and Jlabel*/
package FourthA;
import javax.swing.*;
import java.awt.*;
public class fourthA_HelloSwing {

    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Swing Welcome");

        // Create a JLabel with the message
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", SwingConstants.CENTER);

        // Set font style: Plain, size 32
        label.setFont(new Font("Serif", Font.PLAIN, 32));

        // Set text color to blue
        label.setForeground(Color.BLUE);

        // Add label to frame
        frame.add(label);

        // Set frame size
        frame.setSize(700, 200);

        // Close operation and visibility
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}
