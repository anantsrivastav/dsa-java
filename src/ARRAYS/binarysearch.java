package ARRAYS;

public class binarysearch {

    public static int BinarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;  // moved here

            if(key == arr[mid]){
                return mid;
            }
            if(key > arr[mid]){
                start = mid + 1;   // search in right half
            }
            else {
                end = mid - 1;     // search in left half
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};  // sorted array
        int key = 7;

        System.out.println("Element Found at index: " + BinarySearch(arr, key));
    }
}
