package OOPs;

public class oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(7);
        System.out.println(p1.tip);

        Student s1= new Student();
        s1.Name ="Anant";
        System.out.println(s1.Name);

        BankAccount myAcc = new BankAccount();

        myAcc.username="imAnantSrivastva";
        myAcc.setPassword("ananjbg");

        System.out.println(myAcc.username);

    }




}

class Pen{
    // Attributes

    String color;
    int tip;

    void setColor(String newColor){
        color= newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }

}

class Student{

    String Name;
    int Rollno;
    float percentage;

    void calcPercentage(int phy, int chem, int maths){
        percentage = (phy+chem+maths)/100;
    }

}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String newPassword){
        password = newPassword;
    }
}
