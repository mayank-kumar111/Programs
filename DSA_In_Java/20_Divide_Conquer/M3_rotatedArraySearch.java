public class M3_rotatedArraySearch {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int key = 3;
        int index = Search(arr, key, 0, arr.length - 1);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int Search(int[] arr, int tar,int si , int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == tar) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {
            if (tar >= arr[si] && tar <= arr[mid]) {
                return Search(arr, tar, si, mid - 1);
            }
            return Search(arr, tar, mid + 1, ei);
        }
        if (tar >= arr[mid] && tar <= arr[ei]) {
            return Search(arr, tar, mid + 1, ei);
        }
        return Search(arr, tar, si, mid - 1);   
    }
}
