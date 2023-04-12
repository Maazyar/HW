package HW6;

import java.util.Scanner;

public class HW35 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean loan= scanner.nextBoolean();
        if (loan==false){
            System.out.println("Unknown");}else {
            System.out.println("What is your credit score?");
            int cs = scanner.nextInt();
            if (cs < 600) {
                System.out.println("Not eligible");
            } else if (cs > 600 && cs < 700) {
                System.out.println("Maybe eligible");
            } else if (cs > 701 && cs < 800) {
                System.out.println("Eligible");
            } else {
                System.out.println("Definitely eligible");
            }
        }
    }
}
