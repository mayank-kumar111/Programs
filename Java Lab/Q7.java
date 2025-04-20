class aa {
    aa(int a) {
        System.out.println("base cccc");
    }
}

class Q7 extends aa {
    Q7() {
        super(8888);
        System.out.println("derived cccc");
    }

    public static void main(String yyy[]) {
        new Q7();
    }

}
