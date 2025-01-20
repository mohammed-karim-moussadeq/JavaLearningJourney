package Algo.brocode.hello;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your nationality?");
        int nationality;
        nationality = scanner.nextInt();
        switch (nationality){
            case 1:
                System.out.println("You are Moroccan");
            break;
            case 2:
                System.out.println("You are Canadian");
            break;
            case 3:
                System.out.println("You are American");
            break;
            default:
                System.out.println("Jokes on you tiktok is banned in the US");
        }

    }
}
