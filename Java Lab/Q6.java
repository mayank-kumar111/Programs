class Q6 {
    public void dis() {
        System.out.println(" w a ");
    }

    public void dis(String t) {
        System.out.println(t);
    }

    public void dis(int x, int y) {
        System.out.println(" t a ");
    }

    public void dis(int x, int y, int z) {
        System.out.println(" three a ");
    }

    public void dis(double x, int y, int z) {
        System.out.println(" double a ");
    }

    public static void main(String ggg[]) {
        Q6 aa = new Q6();
        aa.dis();
        aa.dis(34.78, 8, 9);
        aa.dis(78, 8, 9);
        aa.dis(8, 9);
        aa.dis("skit");
    }

}
