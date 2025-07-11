package ARRAYS;

import java.util.Scanner;

public class linearsearch {

    public static int LinearSearch(int[] arr , int key){

        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements: ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element you wanna search: ");

        int key = sc.nextInt();

        int index = LinearSearch(arr, key);

        if(index== -1){
            System.out.println("Element not found: ");
        }
        else{
            System.out.println("Element found at index: " +index);
        }
    }
}
