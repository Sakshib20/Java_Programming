import java.util.*;

public class program620
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int No = 0, Digit = 0, Cnt1 = 0, Cnt0 = 0;

        System.out.println("Enter the number : ");
        No = sobj.nextInt();

        while(No!=0)
        {
            Digit = No%2;
            if(Digit==0)
            {
                Cnt0++;
            }
            else if(Digit==1)
            {
                Cnt1++;
            }
            No = No/2;
        }

        System.out.println("Count of 0 is : "+Cnt0);
        System.out.println("Count of 1 is : "+Cnt1);
        sobj.close();
    }
}
