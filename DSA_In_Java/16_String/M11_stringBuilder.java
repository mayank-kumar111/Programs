public class M11_stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");// append() method concatenates the given argument with this string.
        System.out.println(sb);
        sb.insert(5, " Java");// insert() method inserts the given string with this string at the given position.
        System.out.println(sb);
        sb.replace(5, 9, " C++");   // replace() method replaces the string from the specified beginIndex and endIndex.
        System.out.println(sb);
        sb.delete(5, 9);   // delete() method deletes the string from the specified beginIndex and endIndex.
        System.out.println(sb);
        sb.reverse();   // reverse() method reverses the string.
        System.out.println(sb);
        StringBuilder sb1 = new StringBuilder("");
        System.out.println(sb1.capacity());   // capacity() method returns the current capacity of the String Builder.
        for (int i = 0; i < 100; i++) {
            sb1.append("a");
        }
        System.out.println(sb1.capacity());

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World");
        System.out.println(sb2);
        sb2.setLength(5);   // setLength() method sets the length of the string.
        System.out.println(sb2);
        sb2.setLength(10);
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("Hello");
        sb3.append(" World");
        System.out.println(sb3);
        System.out.println(sb3.charAt(1));   // charAt() method returns the character at the specified index.
        System.out.println(sb3.indexOf("World"));   // indexOf() method returns the index of the first occurrence of the specified substring.
        System.out.println(sb3.lastIndexOf("World"));   // lastIndexOf() method returns the index of the last occurrence of the specified substring.
        System.out.println(sb3.substring(6));   // substring() method returns the substring from the specified beginIndex.
        System.out.println(sb3.substring(0, 5));   // substring() method returns the substring from the specified beginIndex to endIndex.

        StringBuilder sb4 = new StringBuilder("Hello");
        sb4.append(" World");
        System.out.println(sb4);
        System.out.println(sb4.toString());   // toString() method returns the string representation of the object.

        StringBuilder sb5 = new StringBuilder("Hello");
        sb5.append(" World");
        System.out.println(sb5);
        System.out.println(sb5.length());   // length() method returns the length of the string.

        StringBuilder sb6 = new StringBuilder("Hello");
        sb6.append(" World");
        System.out.println(sb6);
        System.out.println(sb6.subSequence(6, 11));   // subSequence() method returns the subsequence from the specified beginIndex to endIndex.

        StringBuilder sb7 = new StringBuilder("Hello");
        sb7.append(" World");
        System.out.println(sb7);
        System.out.println(sb7.codePointAt(1));   // codePointAt() method returns the Unicode of the character at the specified index.

        StringBuilder sb8 = new StringBuilder("Hello");
        sb8.append(" World");
        System.out.println(sb8);
        System.out.println(sb8.codePointBefore(1));   // codePointBefore() method returns the Unicode of the character before the specified index.

        StringBuilder sb9 = new StringBuilder("Hello");
        sb9.append(" World");
        System.out.println(sb9);
        System.out.println(sb9.codePointCount(0, 5));   // codePointCount() method returns the Unicode of the character before the specified index.

        StringBuilder sb10 = new StringBuilder("Hello");
        sb10.append(" World");
        System.out.println(sb10);
        System.out.println(sb10.offsetByCodePoints(0, 5));   // offsetByCodePoints() method returns the index of the character at the specified code point distance.

        StringBuilder sb11 = new StringBuilder("Hello");
        sb11.append(" World");
        System.out.println(sb11);
        System.out.println(sb11.capacity());   // capacity() method returns the current capacity of the String Builder.

        StringBuilder sb12 = new StringBuilder("Hello");
        sb12.append(" World");
        System.out.println(sb12);
        System.out.println(sb12.codePoints());   // codePoints() method returns the stream of code points from the given string.

        StringBuilder sb13 = new StringBuilder("Hello");
        sb13.append(" World");
        System.out.println(sb13);
        System.out.println(sb13.chars());   // chars() method returns the stream of characters from the given string.

        StringBuilder sb14 = new StringBuilder("Hello");
        sb14.append(" World");
        System.out.println(sb14);
        System.out.println(sb14.codePointBefore(1));   // codePointBefore() method returns the Unicode of the character before the specified index.
    }
    
}
