class Q2 {
  int aa;
  static int yy;

  void show() {
    System.out.println("Mayank");
  }

  void dis() {
    System.out.println("Kumar");
  }

  public static void main(String ppp[]) {
    Q2 b1 = new Q2();
    System.out.println(b1);
    b1.show();
    b1.dis();
    int a = 90;
    System.out.println(a);
    (new Q2()).show();
    (new Q2()).dis();
    System.out.println(b1.aa);
    System.out.println(Q2.yy);
    Q2 b = new Q2();
    b.show();
    b.dis();
    // System.out.println(b.aa);
    System.out.println(Q2.yy);

  }
}