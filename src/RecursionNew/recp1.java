package RecursionNew;

public class recp1 {
    public static void printSum(int n){
        if(n==1){
            System.out.print(n);
            return;
        }

       printSum(n-1);
        System.out.print(n);
    }

    public static void printRevNaturalnum(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n);


        printRevNaturalnum(n-1);

    }

    public static int printFact(int n){
        if(n==0){
            return 1;
        }


        return n * printFact(n-1);
    }

    public static int printFibonacci(int n){
        if(n==0 || n==1){
            return n;
        }

        int prev = printFibonacci(n-1);
        int prevPrev = printFibonacci(n-2);

        return prev + prevPrev;


    }
    public static int sumOfdDigits(int n){
        if(n>=0 && n<=9){
            return n;
        }

        // recursion
        return sumOfdDigits(n/10) + n%10;

    }

    public static int countDigit(int n){



        if(n>=0 && n<=9){
            return 1;
        }




        return countDigit(n/10)+1;

    }

    public static int pow(int num, int n){

        if(n==0){
            return 1;
        }

        return num * pow(num, n-1);
    }

    public static void printMultiples(int num, int k){

        if(k==1){
            System.out.println(num);
            return;
        }


        // recursion
        printMultiples(num, k-1);

        System.out.println(num*k);
    }

    public static int sumOfnatural(int n){
        if(n==1){
            return 1;
        }


        return n + sumOfnatural(n-1);

    }

    public static int series(int num){

        if(num==1){
            return 1;
        }




        if(num%2==0) {
            return series(num - 1) - num;
        }

        return series(num-1)+num;

    }

    public static void main(String[] args) {
//        printSum(5);
//        printRevNaturalnum(5);
        //System.out.println(printFact(5));
//        System.out.println(printFibonacci(8));
//        for(int i=0;i<=10; i++){
//            System.out.print(printFibonacci(i)+" ");
//        }



//
//        System.out.println(sumOfdDigits(12345));
//
//        System.out.println(countDigit(12345));
//
//        System.out.println(pow(3,3));

//       printMultiples(5,4);
//
//        System.out.println(sumOfnatural(5));

        System.out.println(series(3));

    }
}
