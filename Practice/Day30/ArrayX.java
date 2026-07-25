// Checking if array is sorted or not

public class ArrayX 
{
    public static void main(String [] A)
    {
        int[] Arr = {0,1,2,3,4};
        boolean bFlag = false;

        for(int i = 0; i<Arr.length-1; i++)
        {
            if(Arr[i]>Arr[i+1])
            {
                bFlag = false;
                break;
            }
            else
            {
                bFlag = true;
            }
        }

        if(bFlag)
        {
            System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is not sorted");
        }
    }
}
