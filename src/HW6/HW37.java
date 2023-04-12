package HW6;

import java.util.Scanner;

public class HW37 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean thirst=scanner.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean sleepy=scanner.nextBoolean();
        if (thirst==true&&sleepy==true){
            System.out.println("Looks like you need to drink coffee");}
        else if (thirst==true&&sleepy==false){
            System.out.println("Looks like you need to drink water");}
        else if (thirst==false&&sleepy==true){
            System.out.println("Looks like you need to drink tea");}
        else {
            System.out.println("Looks like you need to drink nothing");}
    }
}
