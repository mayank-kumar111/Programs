public class M6_shallowAndDeepCopy {
    public static void main(String[] args) {
        // Shallow Copy
        System.out.println("Shallow Copy");
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1;
        arr2[0] = 100;
        System.out.println(arr1[0]); // 100

        // Deep Copy
        System.out.println("Deep Copy");
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = new int[arr3.length];
        for (int i = 0; i < arr3.length; i++) {
            arr4[i] = arr3[i];
        }
        arr4[0] = 100;
        System.out.println(arr3[0]); // 1
    }
}
