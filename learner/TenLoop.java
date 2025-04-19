package learner;
import java.util.Scanner;

public class TenLoop {
    public static void main(String[] args) {
        
        // Increase count from 1 to 20 using a while loop
        /* 
        int num = 1;  // Initialization
        while (num <= 20) {  // Condition
            System.out.println(num);
            num++;  // Update condition
        }
        */

        // Decrease count from 500 to 200 using a while loop
        /* 
        int count = 500;
        while (count >= 200) {
            System.out.println(count);
            count--;  // Update condition
        }
        */

        // Prompt the user to enter a number 5 times
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            System.out.print("Enter a number: ");
            int inp = input.nextInt();
            System.out.println("Number is: " + inp);
            i++;
        }
        input.close();  // Close Scanner to prevent resource leaks
    }
}
