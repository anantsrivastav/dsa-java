package OOPs;

public class constr {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Anant");
        s1.Name = "Anant Srivastava";
        s1.age = 20;
        s1.password ="hdhfu";
        s1.marks[0]=90;
        s1.marks[1]=95;
        s1.marks[2]=80;

        Student1 s2 = new Student1(s1);
        s2.password ="kjdbj";
        s1.marks[2]=83;

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }

}

class Student1{
    String Name;
    int age;
    String password;
    int marks[];


    //copy constructor

    Student1(Student1 s1){
        marks = new int[3];
        this.Name = s1.Name;
        this.age = s1.age;

        for(int i=0; i<3; i++){
            this.marks[i]= s1.marks[i];
        }
    }

    Student1(String Name){
        marks = new int[3];
        this.Name = Name;
    }
    Student1(int age){
        marks = new int[3];
        this.age = age;
    }
}

