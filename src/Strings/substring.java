package Strings;

public class substring {
    public static String substring(String str, int si, int ei){
        String s ="";
        for(int i= si; i<ei; i++){
           s = s+ str.charAt(i);
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(substring("Anant Srivastava"  ,0,5));

        //Another way
        String str = "Anant";
        System.out.println(str.substring(0,5));
    }
}
