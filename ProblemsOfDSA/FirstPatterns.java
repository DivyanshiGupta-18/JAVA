package ProblemsOfDSA;

public class FirstPatterns {
    public static void main(String[] args) {
        int N = 5; 
    patternOne(N);
    patternTwo(N);
    patternThree(N);
    patternFour(N);
    patternFive(N);
    patternSix(N);
    patternSeven(N);
    patternEight(N);
    patternNine(N);
    patternTen(N);
    patternEleven(N);
}
   
//pattern one
/*
 *****
 *****
 *****
 *****
 *****
 **/

public static void patternOne (int N) {
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

public static void patternTwo (int N) {
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
            System.out.print(i+"");
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
            System.out.print(j+"");
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

 public static void patternFive (int N) {
    for (int i = 0; i < N; i++)
    {
        for (int j = N; j > i; j--)
        {
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
    for (int i = 0; i < N; i++)
    {
        for (int j = N; j > i; j--)
        {
            System.out.print(N-j+1+" ");
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

 public static void patternSeven(int N){
      for(int i = 0; i<N; i++){
               //space
               for(int j = 0; j<N-i-1; j++) {
                System.out.print(" ");
               }
               //star
               for(int j = 0; j<2*i+1; j++) {
                System.out.print("*");
               }
              //space
              for(int j = 0; j<N-i-1; j++) {
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

  public static void patternEight(int N){
    for(int i = 0; i<N; i++){
             //space
             for(int j = 0; j<i; j++) {
              System.out.print(" ");
             }
             //star
             for(int j = 0; j<2*N-(2*i+1); j++) {
              System.out.print("*");
             }
            //space
            for(int j = 0; j<i; j++) {
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

public static void patternNine(int N){
    for (int i = 0; i < N; i++)
    {
        for (int j =0; j<N-i-1; j++)
        {
            System.out.print(" ");
        }
       
        for(int j=0;j< 2*i+1;j++){
            
            System.out.print("*");
        }
        
         for (int j =0; j<N-i-1; j++)
        {
            System.out.print(" ");
        }

        System.out.println();
    }

{
    for (int i = 0; i < N; i++)
    {
        for (int j =0; j<i; j++)
        {
            System.out.print(" ");
        }
        for(int j=0;j< 2*N -(2*i +1);j++){
            
            System.out.print("*");
        }
        
        for (int j =0; j<i; j++)
        {
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

public static void patternTen(int N){
    for(int i=1;i<=2*N-1;i++){
        
        int stars = i;
        
        if(i>N) stars = 2*N-i;
        for(int j=1;j<=stars;j++){
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
public static void patternEleven(int N){
    int start =1;
      for(int i=0;i<N;i++){
          if(i%2 ==0) start = 1;
          else start = 0;
          for(int j=0;j<=i;j++){
              System.out.print(start + " ");
              start = 1-start;
          }
        System.out.println();
      }
}


}