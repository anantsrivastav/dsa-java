package OOPs;

public class oops5 {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        rook r = new rook();
        r.moves();

        King k = new King();
        k.moves();


        bear b =new bear();
        b.eat();
    }
}
interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves() {
        System.out.println("up, down, left, right, diagonal in all 4 direction");
    }
}

class rook implements ChessPlayer{
    public void moves(){
        System.out.println("left right up down");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("left right up down by 1 steps");
    }

}

interface Herbivorous{
    void eat();
}

interface Carnivorous{
//    void eat();
}

class bear implements Herbivorous, Carnivorous{
    public void eat(){
        System.out.println("veg aur non veg dono kha leta hai");
    }
}
