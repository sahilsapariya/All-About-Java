import java.util.*;

//          Data Types
//  Primitive       Non-Primitive
//  
//  byte            String
//  short           Array
//  char            Class
//  boolean         Object
//  int             Interface
//  long
//  float
//  double

public class Main {
    public static void main(String[] args) {
        // variables
        String name = "Sahil Sapariya";
        int age = 78;
        double price = 25.25;

        System.out.println(name);
        System.out.println(age);
        System.out.println(price);


        // Input
        Scanner sc = new Scanner(System.in);

        String Name = sc.nextLine();
        System.out.println(Name);
        
        sc.close();
    }
}
