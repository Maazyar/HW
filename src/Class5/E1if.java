package Class5;

import java.util.Scanner;

public class E1if {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Is it time for break true/false");
        boolean isBreak = input.nextBoolean();
        if (isBreak) {
            System.out.println("Lets have a break");
        }
    }
}
