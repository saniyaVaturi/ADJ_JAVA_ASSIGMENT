package Fifth;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;
public class fiveC_CountryCapitalList extends JFrame {
    public fiveC_CountryCapitalList() {
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "No single capital (continent)");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(countryList);

        countryList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                for (String selected : countryList.getSelectedValuesList()) {
                    System.out.println("Capital of " + selected + " is " + capitals.get(selected));
                }
            }
        });

        add(scrollPane);
        setTitle("Country and Capitals");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new fiveC_CountryCapitalList();
    }
}
