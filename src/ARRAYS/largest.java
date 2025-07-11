package ARRAYS;

import java.util.Scanner;

public class largest {

    public static int Largest(int[] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largestelement = Largest(arr);

        System.out.println("The Largest number is: " + largestelement);
    }
}