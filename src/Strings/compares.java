package Strings;

public class compares {
    public static void main(String[] args) {

        String s1 = "Anant";
        String s2 = "Anant";
        String s3 =new String("Anant");

        if(s1==s2){
            System.out.println("Both strings are same ");
        }
        else{
            System.out.println("Both strings are not same ");
        }

        if(s2==s3){
            System.out.println("Both strings are same");
        }
        else{
            System.out.println("Both strings are not same");
        }

        if(s2.equals(s3)){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("strings are not equal");
        }
    }
}
