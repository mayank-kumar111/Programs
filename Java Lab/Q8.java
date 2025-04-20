interface i {
    int y = 90;

    void sss();
}

interface ii {
    void rrr();
}

interface Q8 extends i, ii {
    public static void main(String[] args) {
        pp p = new pp();
        p.sss();
        p.rrr();
        System.out.println("Interface variable y: " + i.y);
    }
}

class pp implements Q8 {
    public void sss() {
        System.out.println("sss() method from interface i. y = " + y);
    }

    public void rrr() {
        System.out.println("rrr() method from interface ii");
    }
}