package HW4;

import java.util.Scanner;

public class Scanner22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name");
        String name= scanner.next();
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Enter your mobile number");
        String mobileNumber= scanner.next();
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= scanner2.nextInt();
        System.out.println("Youre name is "+name+", your age is "+age+
                " and your mobile number is "+mobileNumber);

    }
}
