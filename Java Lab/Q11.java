import javax.swing.*;
import java.awt.*;

public class Q11 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("welcome skit", 10, 40);
        setForeground(Color.red);
        g.fillRect(40, 70, 100, 300);
        g.drawRoundRect(140, 70, 100, 100, 70, 90);
        g.drawLine(14, 170, 150, 200);
        g.drawOval(200, 300, 230, 290);
        g.drawArc(20, 30, 23, 290, 45, 90);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Q11");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 900);
        frame.add(new Q11());
        frame.setVisible(true);
    }
}