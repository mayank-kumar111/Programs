
class Q20 implements Runnable  {
    public void run() {
        System.out.println("Runnable is running");
    }

    public static void main(String sss[]) {
        System.out.println(Thread.currentThread());
        Q20 s1 = new Q20(); // new state
        Thread t1 = new Thread(s1);
        t1.start(); // run state
        t1.setName("Mayank");
        System.out.println(t1.getName());
        Q20 s2 = new Q20(); // new state
        Thread t2 = new Thread(s2);
        t2.start(); // run state
        System.out.println(t2.getName());
        System.out.println(t2.getPriority());
        // t2.setPriority(3);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);

        Q20 s3 = new Q20(); // new state
        Thread t3 = new Thread(s3);
        t3.start(); // run state
        System.out.println(t3.getName());
    }
}