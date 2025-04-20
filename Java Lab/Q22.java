public class Q22 {
    public static void main(String sss[]) {
        String str = "Hello";
        int a=56;
        System.out.println(str);
        System.out.println(a);
        String str1=new String("Hello Mayank");
        //str1=str;
        System.out.println(str1);
        System.out.println(str1.equals(str));
        System.out.println(str1.compareTo(str));
        System.out.println(str1.length());
        System.out.println(str1.indexOf('M'));
        System.out.println(str1.charAt(6));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.startsWith("H"));
        System.out.println(str1.endsWith("k"));
        System.out.println(str1.substring(6,12));
        System.out.println(str1.replace('M','m'));
        System.out.println(str1.trim());
        System.out.println(str1.concat(" How are you?"));
        String ss[] = new String[3];
        ss=str1.split(" ");
        System.out.println(ss[0]);
        System.out.println(ss[1]);
    }
    
}
