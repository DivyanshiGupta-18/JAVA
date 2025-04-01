import java.util.Scanner;
public class TwelveReturn {

    public static void main(String[] args) {
        greet();
        int first = readNumber();
        int second = readNumber();

        int sum = first + second;
        System.out.println("Sum of the numbers is: " + sum);
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = input.nextInt();
        return number;
    }

    public static void greet() {
        System.out.println("Welcome to Calculator\n");
    }

}





//parameter & arguments

// public class Parameter {
//     public static void main(String[] args) {
//         System.out.println(sumTwoNumbers(4, 7));
//         System.out.println(sumTwoNumbers(5, 9));
//         System.out.println(sumTwoNumbers(-67, 67));
//     }

//     public static int sumTwoNumbers(int firstNum, int secondNum) {
//         System.out.println("First Number received: " + firstNum);
//         System.out.println("Second Number received: " + secondNum);
//         return firstNum + secondNum;
//     }
// }
