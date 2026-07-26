/*
Given two numbers a and b, find kth digit from right of ab.

Example :

Input: a = 3, b = 3, k = 1
Output: 7
Explanation: 33 = 27 and 1st digit from right is 7

*/
import java.util.Scanner;

public class Find {

    public static void kthDigit(int a,int b, int k)
    {
        long num = (long) Math.powExact(a,b);

        System.out.println(num);
        
        int i = 0;

        while(num>0)
        {
            long digit = num%10;
            num = num/10;
            i++;

            if(i==k)
            {
                System.out.println(digit);
                return;
            }

            
        }
    }

    public static void main(String [] A)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number : ");
        int a = sc.nextInt();

        System.out.println("Enter the 2nd number : ");
        int b = sc.nextInt();

        System.out.println("Enter the value for k : ");
        int k = sc.nextInt();

        kthDigit(a,b,k);

    }
    
}
