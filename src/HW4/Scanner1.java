package HW4;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("Please Enter First Name");
        String firstName=scanner.next();
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Please Enter Last Name");
        String lastName=scanner1.next();
        System.out.println(firstName+" "+lastName);
    }
}
