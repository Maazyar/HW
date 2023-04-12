package Class5;

import java.util.Scanner;

public class E3Else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("You cant drive yet!");
        }else {
            System.out.println("You can drive");
        }
    }
}