class p {
	int a = 67;
	int b = 999;
}

class Q10 extends p {
	int a = 90;

	public void dis() {
		System.out.println(super.a);
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String hytg[]) {
		Q10 qq = new Q10();
		qq.dis();
	}

}
