class Q3 {
  Q3() {
    System.out.println("constructor");
  }

  Q3(int aa) {
    System.out.println("constructor paramaterised");
  }

  Q3(Q3 a11) {
    System.out.println("constructor copy");
  }

  public static void main(String aaa[]) {
    Q3 c1 = new Q3();
    System.out.println(c1);
    new Q3();
    Q3 c3 = new Q3();
    Q3 c4 = new Q3(6233);
    Q3 c5 = new Q3(c4);
    Q3 c6 = c5;
    System.out.println(c6);
    Q3 c2 = c3;
    System.out.println(c2);
  }
}