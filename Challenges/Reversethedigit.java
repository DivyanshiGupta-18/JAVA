package Challenges;

import java.util.Scanner;

public class Reversethedigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
        System.out.println("Welcome to find Reverse the digit number");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("Reverse of your number is: " + reverse);
    }
    finally{
        input.close();
    }
}
    public static int reverse(int num){
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
