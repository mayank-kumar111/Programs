public class M2_unaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        int c = 10;
        int d = c++;
        System.out.println(c);
        System.out.println(d);

        int e = 10;
        int f = --e;
        System.out.println(e);
        System.out.println(f);

        int g = 10;
        int h = g--;
        System.out.println(g);
        System.out.println(h);

        int i = 10;
        int j = -i;
        System.out.println(i);
        System.out.println(j);

        boolean k = true;
        boolean l = !k;
        System.out.println(k);
        System.out.println(l);

        boolean m = false;
        boolean n = !m;
        System.out.println(m);
        System.out.println(n);

        int o = 10;
        int p = ~o;
        System.out.println(o);
        System.out.println(p);
    }
}
