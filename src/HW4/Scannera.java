package HW4;

import java.util.Scanner;

public class Scannera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);
    }
}
