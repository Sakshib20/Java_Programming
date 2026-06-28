import java.util.HashMap;

public class TwoSum 
{
    public static int[] twoSum(int[] arr, int trg)
    {
        HashMap<Integer, Integer> hobj = new HashMap<>();

        for(int i = 0, diff = 0; i<arr.length; i++)
        {
            diff = trg - arr[i];

            if(hobj.containsKey(diff))
            {
                return new int [] {hobj.get(diff), i};

            }
            else
            {
                hobj.put(arr[i],i);
            }
        }
        return new int [0] ;
    }

    
    public static void main(String [] A)
    {
        int iArr[] = { 2,3,4,2,0};
        int target = 7;

        int[] iRet = twoSum(iArr, target);
        System.out.println("Index are : ");

        for(int i = 0; i<iRet.length; i++)
        {
            System.out.println(iRet[i]+"\t");
        }
    }

}
