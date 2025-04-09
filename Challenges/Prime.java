package Challenges;
import java.util.Scanner;

public class Prime {
     //create a program to check wheather a given number is prime.

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find Prime number");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if(isPrime){
            System.out.println("Your number is Prime");
        }else{
            System.out.println("Your number is not Prime");
        }
     }



     public static boolean isPrime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
     }
}
