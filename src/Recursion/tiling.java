package Recursion;

public class tiling {
    public static int tilingProblem(int n){
        // work
        if(n==0 || n==1){
            return 1;
        }
        int fnm1 = tilingProblem(n-1); // vertical

        int fnm2 = tilingProblem(n-2); // horizontal

        int totalWays = fnm1 + fnm2;

        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(4));

    }
}
