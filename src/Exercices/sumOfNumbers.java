package Exercices;
import java.util.Scanner;
public class sumOfNumbers {
    public static void main(String[] args) {
        System.out.println("What is your number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int total = 0;
        int originalNumber = number;
        number = Math.abs(number);
        while (number > 0) {
            int digit = number % 10;
            total += digit;
            number /= 10;
        }
        System.out.println("The sum of the digits of " + originalNumber + " is " + total );

    }
}
