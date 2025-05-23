package FourthC;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class fourthC_ImageButtonDemo extends JFrame implements ActionListener {




    JButton clockButton, hourGlassButton;
    JLabel messageLabel;

    public fourthC_ImageButtonDemo() {
        setTitle("Image Button Demo");
        setLayout(new FlowLayout());

        // Load images (replace with your actual image paths if needed)
        ImageIcon clockIcon = new ImageIcon("image/digital_clock.jpg");
        ImageIcon hourGlassIcon = new ImageIcon("image/hour_glass.jpeg");

        clockButton = new JButton(clockIcon);
        hourGlassButton = new JButton(hourGlassIcon);

        messageLabel = new JLabel("Click a button");

        clockButton.addActionListener(this);
        hourGlassButton.addActionListener(this);

        add(clockButton);
        add(hourGlassButton);
        add(messageLabel);

        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clockButton) {
            messageLabel.setText("Digital Clock is pressed");
        } else if (e.getSource() == hourGlassButton) {
            messageLabel.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        new fourthC_ImageButtonDemo();
    }
}
