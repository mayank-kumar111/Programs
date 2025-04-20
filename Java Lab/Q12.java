import java.awt.*;

class Q12 {

    public static void main(String args[]) {
        Frame f = new Frame();
        f.setTitle("iiiiiiiiiii");
        f.setVisible(true);
        f.setSize(300, 600);
        TextField t1 = new TextField("sssssss");
        TextField t2 = new TextField(50);
        Label l = new Label("ddddddddd");
        f.add(l);
        List ll = new List();
        ll.add("skit");
        ll.add("vit");
        ll.add("git");
        f.add(ll);
        f.add(t1);
        f.add(t2);
        f.setLayout(new FlowLayout());
        System.out.println(ll.getItemCount());
    }
}
