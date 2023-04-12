package Class7;

import java.util.Scanner;

public class E13WhileLoops {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
     int x= scanner.nextInt();
        int counter=1;
        while (counter<=x){
            System.out.println(counter+" ");
        counter++;
        }
    }
}
