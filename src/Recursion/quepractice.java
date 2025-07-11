package Recursion;

import java.util.Arrays;

public class quepractice {

    public static void Ocurence(int[] arr, int key, int i){

        if(i== arr.length){
            return ;
        }


        if(arr[i]==key){
            System.out.print(i+" ");
        }

        Ocurence(arr,2,i+1);
    }

    public static void DigitToString(int num){
        if(num==0){
            return;
        }
        int last_digit = num%10;
        DigitToString(num/10);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,2,6,7,2,9,0,6,2};

        Ocurence(arr,2,0);

    }

   public static int fib(int num){
        if(num==0 || num==1){
            return num;
        }
        int fib1 = fib(num-1);
        int fib2 = fib(num-2);
        int fb = fib1 + fib2;

        return fb;
    }
}