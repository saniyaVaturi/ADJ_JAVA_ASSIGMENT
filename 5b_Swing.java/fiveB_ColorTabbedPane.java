package Fifth;
import javax.swing.*;
import java.awt.*;

public class fiveB_ColorTabbedPane extends JFrame{
    public fiveB_ColorTabbedPane() {
        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        tabbedPane.add("RED", redPanel);
        tabbedPane.add("BLUE", bluePanel);
        tabbedPane.add("GREEN", greenPanel);

        add(tabbedPane);
        setTitle("Color Tabs");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new fiveB_ColorTabbedPane();
    }
}
