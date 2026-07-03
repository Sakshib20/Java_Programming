// Take an array of numbers as input and check if it is an array sorted in ascending order.
import java.util.Scanner;

public class Array1 
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int iSize = sc.nextInt();

        int [] Arr = new int[iSize];

        System.out.println("Enter the elements :\n");
        for(int i = 0; i<iSize; i++)
        {
            Arr[i] = sc.nextInt();
        }

        boolean bflag = true;
        for(int i = 0; i<iSize-1; i++)
        {
            if(Arr[i]>Arr[i+1])
            {
                bflag = false;
                break;
            }
        }

        if(bflag)
        {
            System.out.println("Array Sorted in ascending order ");
        }
        else
        {
            System.out.println("Array Not Sorted in ascending order ");
        }

    }
}
