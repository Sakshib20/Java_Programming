// Checking if array is sorted or not

import java.util.Scanner;

public class ArrayXX 
{
    public static boolean checkSorted(int[] Arr)
    {
        for(int i = 0; i<Arr.length-1; i++)
        {
            if(Arr[i]>Arr[i+1])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String [] A)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");

        int size = sc.nextInt();

        int[] Arr = new int[size];

        System.out.println("Enter the elements of Array : ");

        for(int i = 0; i<size; i++)
        {
            Arr[i] = sc.nextInt();
        }

        boolean bRet = checkSorted(Arr);

        if(bRet)
        {
            System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is not sorted");
        }
        
    }
}
