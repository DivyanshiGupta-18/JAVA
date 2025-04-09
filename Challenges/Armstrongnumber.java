package Challenges;

import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        try{
        System.out.println("Welcome to Armstrong number");
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.println("Your number is Armstrong");
        }else{
            System.out.print("Your number is not Armstrong");
        }
    }
    finally{
        input.close();
    }
    }


    public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        int finalNumber = 0;
        while (num > 0) {
            int lastDigits = num % 10;
            num /= 10;
            finalNumber += pow(lastDigits ,  noOfDigits);
        }
        return finalNumber == numCopy;
    }


    public static int pow(int num1, int num2){
        int result = num1;
        int i = 1;
        while (i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }


    public static int noOfDigits(int num){
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }
}
