// Sum of n natural numbers

import java.util.Scanner;

public class SumR 
{
    public static void Sum(int no,int result)
    {
        if(no == 0)
        {
            System.out.println(result);
            return;
        }

        result = result + no;
        Sum(no-1,result);
       
    }

    public static void main(String [] A)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        
        int no = sc.nextInt();
        Sum(no,0);
        
    }
    
}
