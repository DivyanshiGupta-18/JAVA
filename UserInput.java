import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your name");
        String name = input.nextLine();
        System.out.println("Good Morning " + name);
        System.out.println(name + ", Also tell me your age");
        int age = input.nextInt();
        System.out.println("Your age is:" + age);


        System.out.println(name + " Welcome to our Calculator");
        System.out.println("Please enter first number: ");
        int firstNum = input.nextInt();
        System.out.println("Now, please enter the second number");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Sum of your number is " + sum);
    }
}
