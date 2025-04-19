package learner;
import java.util.Scanner;

    public class SixShorthand {
        public static void main(String[] args) {
            int a = 5;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a");
            int x1 = input.nextInt();
            a = a + x1;
            a += x1;


            System.out.println(a);
            int x2 = input.nextInt();
            a = a + x2;
            System.out.println(a);
            int x3 = input.nextInt();
            a = a + x3;
            System.out.println(a);
            int x4 = input.nextInt();
            a = a + x4;
            System.out.println(a);

        }
    }

