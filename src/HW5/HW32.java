package HW5;

import java.util.Scanner;

public class HW32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your gender: M or F ");
        String gender = input.nextLine();
        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        if (age > 25) {
            if (gender.equals("F")) {
                System.out.println("Woman");
            } else {
                System.out.println("Man");
            }
        } else {
            if (gender.equals("F")) {
                System.out.println("Girl");
            } else {
                System.out.println("Boy");
                System.out.println();
            }
        }
    }
}
