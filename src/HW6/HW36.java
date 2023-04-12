package HW6;

import java.util.Scanner;

public class HW36 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two strings");
        String a=scanner.next();
        String b=scanner.next();
        System.out.println("Please enter two numbers");
        int c= scanner.nextInt();
        int d= scanner.nextInt();
        if (a.equals(b)&&c==d) {
            System.out.println("AND");
        }
        else if (a.equals(b)||c==d){
            System.out.println("OR");}
        else {
            System.out.println("NONE");
        }
    }
}
