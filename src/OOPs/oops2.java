package OOPs;

public class oops2 {

    public static void main(String[] args) {

        Pen1 p1= new Pen1();

        p1.setColor("Blue");
        p1.setTip(10);

        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }

}
class Pen1{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String color){
        this.color = color;
    }

    void setTip(int tip){
        this.tip = tip;
    }

}
