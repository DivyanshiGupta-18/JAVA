//create a program that determines the greatest of the three number 
package Challenges;

import java.util.Scanner;

public class Greatestnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome , and find the greatest of three number\n");
        System.out.print("Please enter your first number: ");
        int first = input.nextInt();

        System.out.print("Now Please enter your second number: ");
        int second = input.nextInt();

        System.out.print("Finally Please enter your third number: ");
        int third = input.nextInt();

        if(first >= second && first >= third){
            System.out.println(first + " is the greatest number");
        }else if(second >= third){
            System.out.println(second + " is the greatest number");
        }else{
            System.out.println(third + " is the greatest number");
        }
    }
}
