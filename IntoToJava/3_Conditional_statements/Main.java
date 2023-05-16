import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // if-else statements
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        }
        else if (a > b) {
            System.out.println("a is greater");
        }
        else {
            System.out.println("a is lesser");
        }


        // switch break
        int button = sc.nextInt();

        switch(button) {
            case 1: System.out.println("Hello");
            break;

            case 2: System.out.println("Namaste");
            break;

            case 3: System.out.println("Banjour");
            break;

            default: System.out.println("Invalid button");
        }
        sc.close();
    }    
}
