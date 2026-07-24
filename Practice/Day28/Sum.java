// Sum of n natural numbers

import java.util.Scanner;

public class Sum 
{
    public static int Sum(int no)
    {
        int result = 0;
        for(int i = 0; i<=no; i++)
        {
            result = result + i;
        }

        return result;
    }

    public static void main(String [] A)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        
        int no = sc.nextInt();
        int Ret = Sum(no);

        System.out.println(Ret);
        
    }
    
}
