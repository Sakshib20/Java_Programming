// Checking if array is sorted or not

import java.util.Scanner;

public class Array_R
{
    public static boolean checkSorted(int[] Arr,int index)
    {
        if(index == (Arr.length)-1)
        {
            return true;
        }

        if(Arr[index]>Arr[index+1])
        {
            return false;
        }
        
        return checkSorted(Arr,index+1);
        
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

        boolean bRet = checkSorted(Arr,0);

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
