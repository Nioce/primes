package adas;

/**
 * Two examples of methods for determining whether an int is prime. 
 * You will be asked questions about this code on the loops test.
 * 
 * @author Jon Cooper
 * @version November 18, 2013
 */
public class Primes 
{
    /**
     * Determine if an int is prime.
     * 
     * @param n     number to test
     * @return      true if number is prime, false otherwise
     */
    public static boolean isPrime1(int n)
    {
        double limit = Math.sqrt(n);
        int count = 0;
        if(n < 2) return false;
        for (int i=2; i<n; i++)
        {
            if (n % i == 0) return false;
            count++;
            }
        
        return true;
    }
    
    /**
     * A more efficient way to determine if an int is prime.
     * 
     * @param n     number to test
     * @return      true if number is prime, false otherwise
     */
    public static boolean isPrime2(int n)
    {
        if(n < 2) return false;
        if (n == 2)        return true;
        else if (n % 2==0) return false;
        
        double limit = Math.sqrt(n);
        int count = 0;
        for (int i=3; i<=limit; i+=2)
        {
            if (n % i == 0) return false;
            count++;
        }
        
        return true;
    }
        
    
    public static void main(String[] args)
    {
        // test isPrime1
        System.out.println( isPrime1(1) );
        System.out.println( isPrime1(2) );
        System.out.println( isPrime1(91) );
        System.out.println( isPrime1(643) );
        System.out.println( isPrime1(15485863) );
        System.out.println();
        // test isPrime2
        System.out.println( isPrime2(1) );
        System.out.println( isPrime2(19) );
        System.out.println( isPrime2(91) );
        System.out.println( isPrime2(643) );
        System.out.println( isPrime2(15485863) );
        
        
        // Study the isPrime1 and isPrime2 methods to answer the following:
        
        // 0. Study the method isPrime1. Describe the set of numbers that would be 
        //    tested as divisors when checking the value 19 for primality. Do the 
        //    same for 91 and 643.

        
        // 1. Study the method isPrime2. Describe the set of numbers that would be 
        //    tested as divisors when checking the value 19 for primality. Do the 
        //    same for 91 and 643.
        
        
        // 2. The number 15,485,863 is the 1 millionth prime number. Suppose it is 
        //    tested in both isPrime1 and isPrime2 for primality. About how much
        //    faster will isPrime2 finish testing. Show how you determined your answer.
        // fIRST 15485861
        // second 1967
        
        // 3. In isPrime2, why is the limit calculated before the loop rather than
        //    writing the loop as for (int i=3; i<=Math.sqrt(n); i=i+2)?
        // Cause you only need to proccess half of a loop, due to sqrt
        // So you only cacluclate it once instead of every single loop 
        
        // 4. The number 1 is not prime, however both prime function say that it is.
        //    Negative numbers cannot be prime either. Fix each function so that all
        //    ints less than 2 return false.

        
        
        // Write blocks of code that use isPrime2 to solve the following problems:
        
        // 5. Generate a list of the first 50 prime numbers.
        int count = 0;
        int number = 0;
        while (count < 50){
           if (isPrime2(number)){
               System.out.println(number);
               count++;
           }
           number++;
        }
        System.out.println();
        // 6. What is the 100th prime? the 1000th? The 12847th?
        count = 1;
        number = 0;
        int numbersqrt = 0;
        while (count < 12848){
           if (isPrime2(number)){
               if(count==100||count==1000||count==12847){
               System.out.println(number);
               }
           count++;
           }
        number++;
        }
        System.out.println();
        // 7. In the set of integers from 2-1000000, how many are prime?
         count = 1;
         number = 2;
        while (number < 1000000){
           if (isPrime2(number)){
               count++;
           }
           number++;
        }
        System.out.println(count);
        
        // 8. What is the sum of the all prime numbers below 1000000?
        count = 1;
         number = 2;
        while (number < 1000000){
           if (isPrime2(number)){
               count++;
               System.out.println(number);
           }
           number++;
        }
        
        // 9. What is the sum of the first 1000 prime numbers?
        count = 1;
        number = 2;
        int sum = 0;
        while (number < 1000){
           if (isPrime2(number)){
               count++;
               sum = sum + number;
           }
           number++;
        }
        System.out.println(sum);
        
    }
    
}
