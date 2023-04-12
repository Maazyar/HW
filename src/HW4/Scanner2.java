package HW4;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the boolean value (true or false): ");
        boolean value = scanner.nextBoolean();
        System.out.println("The boolean value entered is: " + value);
        System.out.println();

    }
}
