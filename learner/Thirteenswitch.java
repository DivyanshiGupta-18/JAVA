package learner;

import java.util.*;
public class Thirteenswitch {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number");
        int button = sc.nextInt();

        switch (button) {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("invaild number");
            break;
        }
        
    }
}
