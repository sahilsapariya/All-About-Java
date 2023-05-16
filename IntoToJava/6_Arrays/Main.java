import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // One dimentional Array
        int size = sc.nextInt();

        // declaration
        int marks[] = new int[size]; 

        // marks[0] = 97;
        // marks[1] = 94;
        // marks[2] = 90;

        for (int i=0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        for (int i=0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Two dimentional Array

        // declaration
        // type[][] arrayName = new type[rows][columns];
        
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        for(int i=0; i<numbers.length; i++) {
            for (int j=0; j<numbers[0].length; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<numbers.length; i++) {
            for (int j=0; j<numbers[0].length; j++) {
                System.out.println(numbers[i][j]);
            }
        }
   
        sc.close();
    }    
}
