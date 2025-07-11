package Recursion;

public class recursionbasics {
    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);

    }

    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");


    }

    public static boolean isSorted(int[] arr, int i){

        if(i== arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static int fact(int n){
        //base
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn= n* fact(n-1);

        return fn;
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int nm1 = sum(n-1);
        int nm= n + sum(n-1);

        return nm;
    }
    public static int firstOccurence(int[] arr, int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    public static int optimizedPow(int a, int n){
        if(n==0){
            return 1;
        }
        int halfpowSq = optimizedPow(a, n/2)* optimizedPow(a,n/2);
        if(n%2!=0){
            halfpowSq = a * optimizedPow(a,n/2) * optimizedPow(a,n/2);
        }
        return halfpowSq;
    }

//    public static int lastOccurence(int[] arr, int key, int i){
//
//        if(i==-1){
//            return -1;
//        }
//
//
//    }

    public static int pow(int x, int n){
        if(n==0){
            return 1;
        }
       int xnm1 = pow(x, n-1);
       int xn = x* xnm1;
       return xn;
    }



    public static void main(String[] args) {
        int n=10;
//        printDec(10);
//        printInc(10);
//        System.out.println(fact(4));
//        System.out.println(sum(5));
//
//        System.out.println(fibonacci(10));
//
//        System.out.println(fibonacci(25));
//
//        int[] arr={1,2,3,4,5};
//        System.out.println(isSorted(arr,0));
//
//        int[] array={1,2,3,2,4,5,6,4,3,7};
//        System.out.println(firstOccurence(array, 4, 0));
//        System.out.println(pow(2,10));

        int a = 2;
        int p = 7;

        System.out.println(optimizedPow(a,p));
    }

    public static int fibonacci(int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        int fib1 = fibonacci(n - 1);
        int fib2 = fibonacci(n - 2);

        int fib_n = fib1 + fib2;


        return fib_n;
    }



    }
