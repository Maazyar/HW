package HW6;

import java.util.Scanner;

public class HW38 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Is it weekend?");
        boolean weekend=scanner.nextBoolean();
        if (weekend==true){
            System.out.println("Today you will be learning Java");}
        else {
            System.out.println("Today you will be learning manual testing");
        }
    }
}
