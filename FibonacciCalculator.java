import java.util.Scanner;

public class FibonacciCalculator {
    public static void main(String[] args) {
        System.out.println("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("Fibonacci series upto " + number +" numbers : ");

        System.out.println(fibonacci1(number));
    }

    public static int fibonacci1(int number) {
        if (number == 2 || number  == 1) {
            return 1;
        }

        return fibonacci1(number - 1) + fibonacci1(number - 2);
    }
}
