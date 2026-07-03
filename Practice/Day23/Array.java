//Linear search

import java.util.Scanner;

public class Array 
{
    public static void main(String [] Args)   
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int iSize = sc.nextInt();

        int [] Arr = new int[iSize];

        System.out.println("Enter the elements :\n");
        for(int i = 0; i<iSize; i++)
        {
            int no = sc.nextInt();
            Arr[i] = no;
        }

        System.out.println("Enter number to search : ");
        int search = sc.nextInt();

        for(int i = 0; i<iSize; i++)
        {
            if(Arr[i] == search)
            {
                System.out.println("Elements is at index : "+i);
                break;
            }
        }
    }
}
