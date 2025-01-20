package Algo.brocode.hello;
import java.util.Scanner;

public class forLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your number to multiplicate? ");
        int i,num;
        num = scanner.nextInt();
        for (i = 10; i < 50;i+=3) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);


        }
    }
}
