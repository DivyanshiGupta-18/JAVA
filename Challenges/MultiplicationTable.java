package Challenges;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Welcome to Multiplication Table");
            System.out.print("Please enter your number: ");
            int num = scanner.nextInt();
            printMultiplicationTable(num);
        } finally {
            scanner.close(); // Properly close the scanner
        }
    }

    public static void printMultiplicationTable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }
}
