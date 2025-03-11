package Challenges;

import java.util.Scanner;

public class Basicmath {
    public static void main(String[] args) {
//        perimeter of quadrilateral
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Welcome to find Perimeter of Quadrilateral");
        System.out.println("Enter the value of a in cms: ");
        double a = newScanner.nextDouble();
        System.out.println("Enter the value of b in cms: ");
        double b = newScanner.nextDouble();
        System.out.println("Enter the value of c in cms: ");
        double c = newScanner.nextDouble();
        System.out.println("Enter the value of d in cms: ");
        double d = newScanner.nextDouble();

        double perimeter = (a + b + c + d);
        System.out.println("The perimeter of the quadrilateral is: " + perimeter + "cm");


//        area of triangle
        System.out.println("Welcome to find area of Triangle");
        System.out.println("Enter the value of Base in cm2: ");
        double Base = newScanner.nextDouble();
        System.out.println("Enter the value of Height in cm2: ");
        double Height = newScanner.nextDouble();

        double triangle = 0.5 * Base * Height;
        System.out.println("The area of Triangle is: " + triangle + "cm2");




//calculate simple interest
        Scanner input = new Scanner(System.in);
      System.out.println("Welcome to Simple Interest Calculator\n");
              System.out.print("Please enter your principle amount Rs");
      int principle = input.nextInt();
              System.out.print("Now, Tell me your rate of interest: ");
      float rate = input.nextFloat();
              System.out.print("Now, tell me for how many years are you borrowing this money: ");
      float years = input.nextFloat();

      float interest = (principle *  rate * years) / 100;
              System.out.println("\n\n Your Simple interest is Rs:" + interest);


//calculate compound interest

        System.out.println("Welcome to Compound interest calculator\n");
        System.out.print("Please enter your principle2 amount Rs");
        int principle2 = input.nextInt();
        System.out.print("Now, Tell me your rate2 of interest: ");
        float rate2 = input.nextFloat();
        System.out.print("Now, tell me for how many years2 are you borrowing this money: ");
        float years2 = input.nextFloat();

        double compInt = principle2 * Math.pow((1 + rate2 / 100), years2);
        System.out.println("Your compound interest is Rs:" + compInt);


        //convert fahrenheit to celsius
        System.out.println("Welcome to convert Fahrenheit to Celsius");
        System.out.print("Enter the value of Fahrenheit: ");
        double fahrenheit = newScanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("The Celsius value is: " + celsius + "C");

    }
}