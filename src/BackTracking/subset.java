package BackTracking;

public class subset {
    public static void FindSubsets(String str, String ans, int i){
        if(i == str.length()){
            System.out.println(ans);
            return;
        }

        FindSubsets(str, ans+str.charAt(i),i+1);

        //no
        FindSubsets(str, ans, i+1);
    }

    public static void main(String[] args) {
        FindSubsets("Anant", " ", 0);
    }

}
