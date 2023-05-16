import java.util.*;

public class Main {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static int calculateSum(int a, int b) {
        return a + b;
    }
    public static int findFactorial(int n) {
        if (n > 0) {
            return n * findFactorial(n-1);
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        printMyName(name);

        int num = sc.nextInt();

        System.out.println(findFactorial(num));

        sc.close();
    }    
}
