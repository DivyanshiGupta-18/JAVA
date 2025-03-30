import java.util.Scanner;

public class NineRelational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wlecome to Ticket Discount Calculator");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        System.out.print("Are you a female? (true/false) ");
        boolean isFemale = input.nextBoolean();

        if(age <= 5){
            System.out.println("You got 75% discount");
        }else if(isFemale){
            System.out.println("You got 50% discount");
        }else if(age > 60 && !isFemale){
            System.out.println("You got 25% discount");
        }else{
            System.out.println("You don't get any discount");
        }
    }
}
















// System.out.println("Welcome to Driving License Portal");
        // System.out.print("Please enter your age: ");
        // int age = input.nextInt();

        // if(age >= 18){
        //     System.out.println("You are eligible to drive");
        // }else{
        //     System.out.println("Bacha abhi cycle chalao");
        // }