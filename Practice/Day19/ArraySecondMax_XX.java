import java.util.Scanner;

public class ArraySecondMax_XX
{
    public static int secondMax(int[] arr)
    {
        if(arr == null || arr.length < 2)
        {
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                sMax = max;
                max = arr[i];

            }
            else if(arr[i]>sMax && arr[i]<max)
            {
                sMax = arr[i];
            }
        }

        return sMax;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int[] Arr;

        System.out.println("Enter size of Array : ");

        int iSize = sobj.nextInt();

        Arr = new int[iSize];

        System.out.println("Enter elements : ");

        for(int i = 0; i<iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        int iRet = secondMax(Arr);

        System.out.println("Second largest element is : "+iRet);

        sobj.close();

    }
}
