package String;

public class compare {
    public static void main(String[] args) {

        String s1 = "Anant";
        String s2 = "Anant";

        String s3 = new String("Anant");

        if(s1==s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("S2 and s1 are not equal");
        }
        if(s2==s3){
            System.out.println("s2 and s3 are equal");
        }
        else{
            System.out.println("S2 and s3 are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("Equal haiiii");
        }
    }
}
