import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,-1);

        // Using lambda expression
        System.out.println("Printing all numbers using lambda...");
        numbers.forEach(number -> System.out.println(number));

        // finding sum of even numbers
        int sumOfEvens = numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of even numbers : " + sumOfEvens);

        // finding the squares of all numbers
        List<Integer> squares = numbers.stream()
                .map(number -> number * number)
                .toList();

        System.out.println("Square list : ");
        System.out.println(squares);

        // doing the doubling of all odd numbers from list
        System.out.println("Doubles of odd number : ");
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number * 2)
                .forEach(number -> System.out.println(number));

        // checking all the numbers present in the list are positive numbers or not
        boolean allGreaterThanZero = numbers.stream()
                .allMatch(number -> number > 0);
        System.out.println("is all the number greater than zero? " + allGreaterThanZero);

        // finding max number from the list
        int maxNumber = numbers.stream()
                .max(Integer::compare)
                .orElse(0);
        System.out.println(maxNumber);
    }
}