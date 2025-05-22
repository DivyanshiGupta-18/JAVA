package learner;
import java.util.*;
 class Ifelse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number");
        int button = sc.nextInt();

        
        if(button == 1){
            System.out.println("Hello");
        }

        else if(button == 2){
            System.out.println("Namste");
        }

        else if(button == 3){
            System.out.println("Bonjour");
        }

        else{
            System.out.println("Invalid button");
        }
    }












    //  public static void main(String[] args){
    //              boolean isMale = true;
    //              String name = "Bob";

    //              System.out.println("before if");
    //              if (isMale) {
    //                  System.out.println("Mr." + name);
    //              } else {
    //                  System.out.println("Ms." + name);
    //              }
    //              System.out.println("after if");

    //              boolean isSeniorCitizen = false;
    //              boolean isAnAdult = true;

    //              if (isSeniorCitizen) {
    //                  System.out.println("Hello Senior Citizen");
    //              } else if (isAnAdult) {
    //                  System.out.println("Hello Adult");
    //              } else {
    //                  System.out.println("Hello Child");
    //              }
    //  }
}
