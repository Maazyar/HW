package HW4;

import java.util.Scanner;

public class Scanner21 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age ");
        int age=scanner.nextInt();
        int a=age+10;
        System.out.println("Your age after 10 years is "+a);
    }
}
