package OOPs;

public class oops4 {
    public static void main(String[] args) {


        Horse harry = new Horse();
        harry.walk();

        chicken chick = new chicken();
        chick.walk();
    }
}
abstract class Animals{
    void sleep(){
        System.out.println("Sleeping ");
    }

    abstract void walk();
}

class Horse extends Animals{
    void walk(){
        System.out.println("Horse walk on 4 legs");
    }
}

class chicken extends Animals{
    @Override
    void walk() {
        System.out.println("Chicken walk on 2 legs");
    }
}
