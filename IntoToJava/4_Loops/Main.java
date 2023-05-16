public class Main {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 10; i++) {
            System.out.printf("Hello world %d\n", i+1);
        }

        // while loop
        int i = 0;
        while (i < 10) {
            System.out.printf("%d Hello world\n", i + 1);
            i++;
        }

        // do-while loop
        int j = 0;
        do {
            System.out.println(j);
            j += 1;
        } while(j < 11);
    }    
}
