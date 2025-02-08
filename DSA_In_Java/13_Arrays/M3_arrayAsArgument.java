public class M3_arrayAsArgument {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);
        System.out.println("After updating the array");
        updateArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " is " + arr[i]);
        }
    }

    public static void updateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
            System.out.println("Element at index " + i + " is " + arr[i]);
        }
    }
}
