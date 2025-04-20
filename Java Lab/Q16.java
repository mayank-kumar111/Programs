import java.awt.*;

class Q16 extends Frame {
    Q16() {
        setVisible(true);
        setSize(300, 300);
        Button n = new Button("ok");
        add(n, BorderLayout.NORTH);
        Button n1 = new Button("ok1");
        add(n1, BorderLayout.EAST);
        Button n2 = new Button("ok2");
        add(n2, BorderLayout.SOUTH);
        Button n3 = new Button("ok3");
        add(n3, BorderLayout.WEST);
        // setLayout(new GridLayout(2,2));
    }

    public static void main(String ttt[]) {
        new Q5();
    }

}
