package ProblemsOfDSA;

public class TwoRecurssion {
    //Sum of First N Numbers
    /*
     Input : N = 4
     Output : 10
     Explanation : first four natural numbers are 1, 2, 3, 4.
     Sum is 1 + 2 + 3 + 4 => 10.
     **/

    public static void main(String[] args) {
        int N = 5;
        // addNumbers(N);
        // factorial(N);
       // reverse(arr, N);
      // palindromeCheck(s);
       //Fibonacci(N);
    }
    public static void addNumbers(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println(sum);

        // int sum = N * (N + 1) / 2;
        // System.out.println(sum);
    }



    
   // Factorial of a given number
/*
        Examples1:
        Input: n = 2
        Output: 2
        Explanation: 2! = 1 * 2 = 2.
        
        Example2:
        Input: n = 0
        Output: 1
        Explanation: 0! is defined as 1.
     **/


     public static void factorial(int N) {
        int sum = N * (N-1);
        System.out.println(sum);
         }


         //Reverse an array
/* 
        Examples:
        Input: n=5, arr = [1,2,3,4,5]
        Output: [5,4,3,2,1]
        Explanation: The reverse of the array [1,2,3,4,5] is [5,4,3,2,1]
*/

public static void reverse(int[] arr, int N) {
    int left = 0;
        int right = N - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
}


//Check if String is Palindrome or Not

/*
     Input : s = "hannah"
     Output : true
     Explanation : The string when reversed is --> "hannah", which is same as original string , so we return true.
    
    
     Input : s = "aabbaaa"
     Output : false
     Explanation : The string when reversed is --> "aaabbaa", which is not same as original string, So we return false.
 */

//  public static boolean palindromeCheck(String s) {
//     int left = 0;
//     int right = cleanedString.length() - 1;

//     while (left < right) {
//         if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
//             return false; // Characters don't match, not a palindrome
//         }
//         left++;
//         right--;
//     }

//     return true;
//  }


 //Fibonacci Number
 /*
  Input : n = 2
  Output : 1
  Explanation : F(2) = F(1) + F(0) => 1 + 0 => 1.


   Input : n = 3
   Output : 2
   Explanation : F(3) = F(2) + F(1) => 1 + 1 => 2.
  */


  public int Fibonacci(int N) {
    if (N <= 1) {
        return N;
    }

    int a = 0;
    int b = 1;

    for (int i = 2; i <= N; i++) {
        int temp = b;
        b = a + b;
        a = temp;
    }

    return b;
  }
}
    
