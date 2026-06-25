import java.util.Scanner;

public class ArraySecondMax 
{
    public static int secondMax(int[] Arr)
    {
        int Max = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;

        for(int i = 0; i<Arr.length; i++)
        {
            if(Arr[i]>Max)
            {
                Smax = Max;
                Max = Arr[i];

            }
            else if(Arr[i]>Smax & Arr[i]<Max)
            {
                Smax = Arr[i];
            }
        }

        return Smax;
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
