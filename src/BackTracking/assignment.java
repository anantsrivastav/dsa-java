package BackTracking;

public class assignment {

    public static void ratWays(int[][] ways, boolean[][] visited, int sr, int sc, int er, int ec , String s){

        // Out of bounds
        if(sr < 0 || sc < 0 || sr > er || sc > ec){
            return;
        }

        // Blocked or already visited
        if(ways[sr][sc] == 0 || visited[sr][sc]){
            return;
        }

        // Destination reached
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }

        // Mark current cell as visited
        visited[sr][sc] = true;

        // Try all 4 directions
        ratWays(ways, visited, sr-1, sc, er, ec, s + "U"); // Up
        ratWays(ways, visited, sr+1, sc, er, ec, s + "D"); // Down
        ratWays(ways, visited, sr, sc+1, er, ec, s + "R"); // Right
        ratWays(ways, visited, sr, sc-1, er, ec, s + "L"); // Left

        // Backtrack (unmark cell)
        visited[sr][sc] = false;
    }

    public static void main(String[] args) {
        int[][] ways = {
                {1, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 0, 1, 1},
                {1, 0, 0, 1}
        };

        boolean[][] visited = new boolean[ways.length][ways[0].length];

        ratWays(ways, visited, 0, 0, 3, 3, "");
    }
}
