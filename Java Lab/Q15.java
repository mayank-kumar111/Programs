class x {
    public void dis() {
        System.out.println("base");
    }

    public void s(int a) {
        System.out.println("base w o ");
    }

}

class Q15 extends x {
    public void dis() {
        System.out.println("derived");
    }

    public void s(int a) {
        System.out.println("dddddddddddddddddd w o ");
    }

    public static void main(String jjj[]) {
        Q15 yy = new Q15();
        yy.dis();
        yy.s(78);
    }

}