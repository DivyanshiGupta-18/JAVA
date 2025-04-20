package ProblemsOfDSA;

public class FirstPatterns {

    public static void main(String[] args) {
        int N = 5;
        // patternOne(N);
        // patternTwo(N);
        // patternThree(N);
        // patternFour(N);
        // patternFive(N);
        // patternSix(N);
        // patternSeven(N);
        // patternEight(N);
        // patternNine(N);
        // patternTen(N);
        // patternEleven(N);
        // patternTwelve(N);
        // publicThirteen(N);
        // publicFourteen(N);
        // publicFifteen(N);
        publicSixteen(N);
        publicSeventeen(N);
    }

//pattern one
/*
 *****
 *****
 *****
 *****
 *****
 **/
    public static void patternOne(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//pattern two
/*
 *
 **
 ***
 ****
 *****
 **/
    public static void patternTwo(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//pattern Three
/*
 1
 22
 333
 4444
 55555
 **/
    public static void patternThree(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "");
            }
            System.out.println();
        }
    }

//pattern Four
/*
 1
 12
 123
 1234
 12345
 **/
    public static void patternFour(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }

//pattern five
/*
 *****
 ****
 ***
 **
 *
 **/
    public static void patternFive(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//pattern six
/*
 12345
 1234
 123
 12
 1
 **/
    public static void patternSix(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print(N - j + 1 + " ");
            }
            System.out.println();
        }
    }

//pattern seven
/*
     *
    ***
   *****
  *******
 *********
 **/
    public static void patternSeven(int N) {
        for (int i = 0; i < N; i++) {
            //space
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    //patter eight
    /*
       *********
        *******
         *****
          ***
           *
  **/
    public static void patternEight(int N) {
        for (int i = 0; i < N; i++) {
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2 * N - (2 * i + 1); j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

//pattern nine
/*
     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *
 **/
    public static void patternNine(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {

                System.out.print("*");
            }

            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * N - (2 * i + 1); j++) {

                    System.out.print("*");
                }

                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

//pattern ten
    /*
             *
             **
             ***
             ****
             *****
             ****
             ***
             **
             *
      **/
    public static void patternTen(int N) {
        for (int i = 1; i <= 2 * N - 1; i++) {

            int stars = i;

            if (i > N) {
                stars = 2 * N - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//pattern eleven
/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
     */
    public static void patternEleven(int N) {
        for (int i = 0; i < N; i++) {
            int start;
            if (i % 2 == 0) {
                start = 1; 
            }else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

//pattern twelve

/*  
     1                 1
     1 2             2 1
     1 2 3         3 2 1
     1 2 3 4     4 3 2 1
     1 2 3 4 5 5 4 3 2 1
     */
    public static void patternTwelve(int N) {
        int spaces = 2 * (N - 1);
        //number
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            //space
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //number
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            spaces -= 2;
        }
    }

//pattern thirteen
/*
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15
 **/

 public static void publicThirteen(int N) {
    int num = 1;
    for (int i = 1; i <= N; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num = num + 1;
        }
        System.out.println();
    }
 }


// pattern Fourteen
/*
 A
 A B
 A B C
 A B C D
 A B C D E
 **/

 public static void publicFourteen(int N){
    for (int i = 0; i < N; i++) {
        for (char ch = 'A'; ch <= 'A' + i; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
 }


 // pattern Fifteen
/*
 A B C D E
 A B C D
 A B C
 A B 
 A 
 **/

public static void publicFifteen(int N){
    for (int i = 0; i < N; i++) {
        for(char ch = 'A'; ch<='A'+(N-i-1);ch++){
            System.out.print(ch  + " ");
        }
        System.out.println();
    }
}


 //pattern Sixteen
 /*
  A
  B B
  C C C
  D D D D
  E E E E E
  */

public static void publicSixteen(int N){
    for(int i=0;i<N;i++){
        for(int j=0;j<=i;j++){
            System.out.print((char)((int)('A'+i)) + " ");
         }
        System.out.println();
    }
}


//pattern Seventeen
/*
     A
   A B A
 A B C B A
A B C D C B A
 **/

 public static void publicSeventeen(int N){
    for(int i=0;i<N;i++){
          
        // for printing the spaces.
        for(int j=0;j<N-i-1;j++){
            System.out.print(" ");
        }
        
        // for printing the characters.
        char ch = 'A';
        int breakpoint = (2*i+1)/2;
        for(int j=1;j<=2*i+1;j++){
            
            System.out.print(ch + " ");
            if(j <= breakpoint) ch++;
            else ch--;
        }
        
        // for printing the spaces again.
        for(int j=0;j<N-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();
        
    }
    }
 }

