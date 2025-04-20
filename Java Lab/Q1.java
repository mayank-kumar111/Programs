class Q1 {
   public static void main(String args[]) {
      System.out.println("hello");
      System.out.println(args.length);
      int i = 0;
      while (i < args.length) {
         System.out.println(args[i]);
         i++;
      }
      System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
      Integer ii = Integer.valueOf(23);
      System.out.println(ii);
      System.out.println(Integer.MIN_VALUE);
      System.out.println(Integer.MAX_VALUE);
      Integer iii = Integer.valueOf("123");
      System.out.println(iii);
   }
}