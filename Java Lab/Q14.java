import javax.swing.*;

public class Q14 extends JPanel {
    public Q14() {
        System.out.println("init");
    }

    public void addNotify() {
        super.addNotify();
        System.out.println("start");
    }

    public void removeNotify() {
        System.out.println("stop");
        super.removeNotify();
    }

    public void destroy() {
        System.out.println("destroy");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Q14");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);
        frame.add(new Q14());
        frame.setVisible(true);
    }
}
