package Exercices;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        System.out.println("what is your number? ");
        Scanner scanner = new Scanner(System.in);
        int num;
        num = scanner.nextInt();
        if (num < 0 ){
            System.out.println("Factorials cannot be negative!!");
        }else {
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of" + " " +num + " is " + factorial);
        }


    }
}






