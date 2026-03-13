import java.util.*;

public class program622
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
/*
    Decimal             Hexadecimal             Binary
        0                   0                    0000
        1                   1                    0001
        2                   2                    0010
        3                   3                    0011
        4                   4                    0100
        5                   5                    0101
        6                   6                    0110
        7                   7                    0111
        8                   8
        9                   9
        10                  a
        11                  b
        12                  c
        13                  d
        14                  e
        15                  f


*/