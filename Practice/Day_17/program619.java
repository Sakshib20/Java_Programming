import java.util.*;

public class program619
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int No = 0, Digit = 0;

        System.out.println("Enter the number : ");
        No = sobj.nextInt();

        while(No!=0)
        {
            Digit = No%2;
            System.out.print(Digit+"\t");
            No = No/2;
        }
        System.out.println();
        sobj.close();
    }
}
