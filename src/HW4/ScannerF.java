package HW4;

import java.util.Scanner;

public class ScannerF {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter first number");
        int x=scanner.nextInt();
        System.out.println("Please enter second number");
        int y= scanner.nextInt();if ((x*y)>0){
            System.out.println("true");}else {
            System.out.println("false");}
    }
}
