import java.util.HashSet;

public class DuplicateRemovalX
{
    public static int[] removeDuplicates(int[] arr) 
    {
        if(arr == null || arr.length<1)
        {
            return new int[0];
        }

        HashSet <Integer> set = new HashSet<> ();

        for(int i = 0; i<arr.length; i++)
        {
            set.add(arr[i]);
        }

        int [] result = new int [set.size()];

        int index = 0;

        for(int i : set)
        {
            result[index] = i;
            index++;
        }

        return result;

    }

    public static void main(String [] A)
    {
        int[] iArr = {1,2,3,4,1,3,2,1,4,3,5,6,6,7,8};

        int [] iRet = removeDuplicates(iArr);

        System.out.println("After Duplicates removal : ");

        for(int i : iRet)
        {
            System.out.println(i+"\t");
        }
    }
}
