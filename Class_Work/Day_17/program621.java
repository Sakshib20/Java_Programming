import java.util.*;

public class program621
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int No = 0, Digit = 0, iCnt = 0;

        System.out.println("Enter the number : ");
        No = sobj.nextInt();

        while(No!=0)
        {
            Digit = No%2;
            
            iCnt = iCnt+Digit;

            No=No/2;   
        }

        System.out.println("Count of 1 is : "+iCnt);

        sobj.close();
    }
}
