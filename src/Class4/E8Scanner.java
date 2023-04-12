package Class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Please enter your salary");
        int salary=Scanner.nextInt();
        if (salary>1000000) {
            System.out.println("You are rich");
        }else {
            System.out.println("Look for better opportunities");
        }
        }
}
