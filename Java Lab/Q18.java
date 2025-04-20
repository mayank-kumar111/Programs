
class Q18 extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (Exception e) {
            }
            /*
             * finally
             * {
             * }
             */
        }
    }

    public static void main(String sss[]) {
        Q18 p1 = new Q18();
        p1.start();
        Q18 p2 = new Q18();
        p2.start();
        Q18 p3 = new Q18();
        p3.start();
    }
}