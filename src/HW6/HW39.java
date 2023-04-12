package HW6;

import java.util.Scanner;

public class HW39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        if (mark > 0 && mark < 100) {
            if (mark < 25) {
                System.out.println("Your grade is F");
            } else if (mark >= 25 && mark < 46) {
                System.out.println("Your grade is E");
            } else if (mark >= 46 && mark < 50) {
                System.out.println("Your grade is D");
            } else if (mark >= 50 && mark < 60) {
                System.out.println("Your grade is C");
            } else if (mark >= 60 && mark < 80) {
                System.out.println("Your grade is B");
            } else if (mark>=80&&mark<=100){
                System.out.println("Your grade is A");}

        }
        else {
            System.out.println("Please enter valid mark");
        }
    }
}