package BackTracking;

public class permutation {
    public static void FindPermutation(String str, String ans){
        // base
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0 ; i<str.length();i++){
            char curr = str.charAt(i);             //choose 1 character
            String NewStr = str.substring(0,i)+ str.substring(i+1);  // remove choosen character
            FindPermutation(NewStr, ans+ curr);
        }
    }

    public static void main(String[] args) {
        FindPermutation("Anant","");

    }
}
