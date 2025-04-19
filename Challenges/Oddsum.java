package Challenges;

import java.util.Scanner;

public class Oddsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Sum");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int sum = oddSum(num);
        System.out.println("OddSum till " + num + " is: " + sum);
    }

    public static int oddSum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;
        }
        return sum;
    }
}







// public static void main(String[] args) {
//     System.out.println("Create a program to calculate sum & average of all the elements in an array.");
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter the number of elements in the array: ");
//     int n = input.nextInt();
//     int[] arr = new int[n];
//     System.out.println("Enter the elements of the array:");
//     for (int i = 0; i < n; i++) {
//         arr[i] = input.nextInt();
//     }
//     int sum = 0;
//     for (int i = 0; i < n; i++) {
//         sum += arr[i];
//     }
//     double average = (double) sum / n;
//     System.out.println("Sum of the elements in the array: " + sum);
//     System.out.println("Average of the elements in the array: " + average);
//     input.close();
// }   
