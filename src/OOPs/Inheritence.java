package OOPs;

public class Inheritence {
    public static void main(String[] args) {
        Dog peter = new Dog();

        peter.eat();
        peter.sound();
        peter.breathe();

        peter.color ="Black and white";

        System.out.println(peter.color);
        peter.legs = 4;
    }

}
class Animal{

    String color;

    void eat(){
        System.out.println("Eating");
    }

    void sleep(){
        System.out.println("Sleeping");
    }

    void breathe(){
        System.out.println("Breathing");
    }

}

class Mammals extends Animal{
    int legs;
}

class Dog extends Mammals{
    String breed;

    void sound(){
        System.out.println("Bark.....");
    }
}
