import java.awt.*;
import java.awt.event.*;

class Q13 extends Frame implements ActionListener {
    TextField t, t1, t2;

    Q13() {
        setVisible(true);
        setSize(600, 500);
        setLayout(new FlowLayout());
        Button b = new Button("ok");
        t = new TextField("no1");
        t1 = new TextField("no2");
        t2 = new TextField(10);
        add(t);
        add(t1);
        add(t2);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ee) {
        String s = t.getText();
        String s1 = t1.getText();
        int i = Integer.parseInt(s);
        int ii = Integer.parseInt(s1);
        int sum = i + ii;
        String s2 = String.valueOf(sum);
        t2.setText(s2);
    }

    public static void main(String gggg[]) {
        new Q13();
    }

}
