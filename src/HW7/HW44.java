package HW7;

import java.util.Scanner;

public class HW44 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String carMake= scanner.next();
        switch (carMake){
            case "BMW":
                System.out.println("german car");
                break;
            case "Toyota":
                System.out.println(" japanese car");
                break;
            case "Maserati":
                System.out.println("italian car");
                break;
            default: System.out.println("unknown");
                    }
        }
    }

