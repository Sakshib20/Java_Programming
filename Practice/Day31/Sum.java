// Find two numbers in an array that add up to a specific target number.

import java.util.Scanner;

public class Sum {

    public static void twoSum(int[] Arr, int trg)
    {
        int idx1 = 0, idx2=0;

        for(int i = 0; i<Arr.length-1; i++)
        {
            for(int j = 1; j<Arr.length;j++)
            {
                if(Arr[i] + Arr[j]==trg)
                {
                    idx1 = i;
                    idx2 = j;
                    System.out.println(trg +" can achieved by adding "+Arr[idx1]+" and "+Arr[idx2]);
                    return;
                }
            }
        }
 
    }

    public static void main(String[] A)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");

        int size = sc.nextInt();

        int[] Arr = new int[size];

        System.out.println("Enter the elements : ");
        for(int i = 0; i<size;i++)
        {
            Arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target number :");
        int target = sc.nextInt();

        twoSum(Arr,target);
    }
    
}
