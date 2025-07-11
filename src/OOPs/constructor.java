//package OOPs;
//
//public class constructor {
//    public static void main(String[] args) {
//
//
//        Anant a1 = new Anant("Srivastava");
//        Anant a2 = new Anant(20);
//       ;
//
//
//        System.out.println(a1.LastName);
//        System.out.println(a2.age);
//
//
//        Employee E1 = new Employee();
//        E1.Name = "Anant";
//        E1.age = 20;
//        E1.Pasword="avshv";
//        E1.salary[0]=100;
//        E1.salary[1]=90;
//        E1.salary[2]=80;
//
//
//
//
//        Employee e2 = new Employee(E1);
//
//        e2.Pasword = "acshyjf";
//    }
//
//
//}
//
//class Anant{
//
//    String LastName;
//    int age;
//    int marks[];
//
//
//
//    Anant(String LastName){
//        marks = new int[3];
//        this.LastName = LastName;
//    }
//    Anant(int age){
//        marks = new int[3];
//        this.age= age;
//    }
//
//
//
//    //we can make different constructors with same name with different parameters
//}
//
//// copy constructor
//
//class Employee{
//    String Name;
//    int age;
//    String Pasword;
//    int salary[] = new int[3];
//
//    //copy constructor
//
//    Employee(Employee E1){
//        this.salary = E1.salary;
//        this.Name = E1.Name;
//        this.age = E1.age;
//    }
//}