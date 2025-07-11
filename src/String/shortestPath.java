package String;

public class shortestPath {
    
    public static double ShortestPath(String str){
        int x =0;
        int y=0;
        
        for(int i=0 ;i<str.length();i++){
            char dir = str.charAt(i);
            
            if(dir=='S'){
                y--;
            } else if (dir=='N') {
                y++;
            } else if (dir=='W') {
                x--;
            }
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;

        double result = Math.sqrt(X2 + Y2);

        return result;
    }

    public static void main(String[] args) {
        String str = "NWESSNNNEWEENESN";

        System.out.println(ShortestPath(str));
    }
}
