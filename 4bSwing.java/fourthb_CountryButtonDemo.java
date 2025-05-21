package FourthB;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class fourthb_CountryButtonDemo extends JFrame implements ActionListener{

    JButton indiaButton, srilankaButton;
    JLabel messageLabel;

    public fourthb_CountryButtonDemo() {
        setTitle("Country Button Demo");
        setLayout(new FlowLayout());

        indiaButton = new JButton("India");
        srilankaButton = new JButton("Srilanka");

        messageLabel = new JLabel("Click a button");

        indiaButton.addActionListener(this);
        srilankaButton.addActionListener(this);

        add(indiaButton);
        add(srilankaButton);
        add(messageLabel);

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == indiaButton) {
            messageLabel.setText("India is pressed");
        } else if (e.getSource() == srilankaButton) {
            messageLabel.setText("Srilanka is pressed");
        }
    }

    public static void main(String[] args) {
        new fourthb_CountryButtonDemo();
    }
}
