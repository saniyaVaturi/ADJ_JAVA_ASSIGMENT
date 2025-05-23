/*5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display them on console whenever the countries are selected on the list.*/
package Fifth;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*; // Needed for ListSelectionListener

public class FiveA_CountryListDisplay extends JFrame {

    public FiveA_CountryListDisplay() {
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(countryList);

        countryList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                for (String selected : countryList.getSelectedValuesList()) {
                    System.out.println("Selected Country: " + selected);
                }
            }
        });

        add(scrollPane);
        setTitle("Country List");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FiveA_CountryListDisplay();
    }
}
