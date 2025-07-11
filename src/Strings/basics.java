package Strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class basics {
    public static void main(String[] args) {

//        String str = "Anant";
//        char[] ch = {'a','b','c'};
//
//        String str2 = new String("abc");
//        System.out.println(str2);
//
        Scanner sc = new Scanner(System.in);
//        String str3 = sc.next();
//        System.out.println(str3);
//
//        String str4 = sc.nextLine();
//        System.out.println(str4);

//        String FullName = "Anant Narayan Srivastava";
//        System.out.println(FullName.length());

        // concatenation

        String FirstName = "Anant";
        String LastName = "Srivastava";

        String FullName = FirstName + " "+ LastName;
        System.out.println(FullName);

        //chatAt

        System.out.println(FirstName.charAt(0));
    }
}
