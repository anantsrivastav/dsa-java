package BackTracking;

public class mazePath {

    public static int Maze(int sr, int sc, int er, int ec){

        if(sr>er || sc>ec){
            return 0;
        }
        if (sr==er &&  sc==ec){
            return 1;
        }

        int downways = Maze(sr+1, sc, er, ec);
        int rightways = Maze(sr, sc+1, er, ec);
        int totalways = downways + rightways;
        return totalways;
    }

    public static void main(String[] args) {

        int count= Maze(0,0,2,2);
        System.out.println(count);
    }
}
