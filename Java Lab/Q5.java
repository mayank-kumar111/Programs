class y {
    int x;
}

class Q5 extends Q15 {
    int x;
    int y;

    void setdata() {
        x = y = 90;
    }

    void getdata() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String gg[]) {
        Q5 y1 = new Q5();
        y1.getdata();
        y1.setdata();
        y1.getdata();
        System.out.println(y1.x);
        System.out.println(y1.y);
    }
}