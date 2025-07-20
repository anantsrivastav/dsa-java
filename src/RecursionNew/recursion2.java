package RecursionNew;

public class recursion2 {

//    public static int GCD(int x, int y){
//        int start= Integer.min(x,y);
//
//        for(int i= start; i>=0;i--){
//            if(x%i==0 && y%i==0){
//                return i;
//            }
//        }
//        return 0;
//    }

    public static int isGCD(int x, int y){
        if(y==0){
            return x;
        }

         return isGCD(y,x%y);
    }

    public static void main(String[] args) {

//        System.out.println(GCD(24, 12));

        System.out.println(isGCD(12,6));
    }

}
