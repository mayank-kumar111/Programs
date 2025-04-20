class Q19 implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread());
        System.out.println("Hello");
        int i = 1;
        while (i <= 5) {
            if (i == 3) {
                try {
                    Thread.currentThread().join(2000);
                } catch (Exception e) {
                }
            }
            System.out.println(i);
            i++;
        }
    }

    public static void main(String sss[]) {
        Q19 r1 = new Q19();
        Thread r22 = new Thread(r1, "SKIT");
        r22.start();
        Q19 r2 = new Q19();
        Thread r33 = new Thread(r2, "VIT");
        r33.start();
    }
}