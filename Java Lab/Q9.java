import java.awt.*;

class Q9 {
    Q9() {
        Frame f = new Frame("nnnnnnnnnnnnn:");
        f.setSize(888, 999);
        f.setVisible(true);

        MenuBar mb = new MenuBar();
        Menu m = new Menu("file");
        Menu m1 = new Menu("edit");
        Menu m2 = new Menu("format");
        Menu m3 = new Menu("help");
        MenuItem mi = new MenuItem("new");
        MenuItem mi1 = new MenuItem("open");
        MenuItem mi2 = new MenuItem("edit");
        MenuItem mi3 = new MenuItem("exit");

        MenuItem mmi = new MenuItem("view help");
        MenuItem mmi1 = new MenuItem("feedback");
        m3.add(mmi);
        m3.add(mmi1);

        m.add(mi);
        m.add(mi1);
        m.add(mi2);
        m.add(mi3);

        mb.add(m);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        f.setMenuBar(mb);
    }

    public static void main(String ttt[]) {
        new Q9();
    }

}
