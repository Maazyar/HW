package HW4;

import java.util.Scanner;

public class ScannerD {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scanner.nextInt();
        if (age>=18){
            System.out.println("You are eligible to vote");}
        else {
            System.out.println("You are not eligible to vote");}
    }
}
