import java.util.HashSet;

public class DuplicateRemoval 
{
    public static Integer[] removeDuplicates(int[] arr) 
    {
        HashSet <Integer> set = new HashSet<> ();

        for(int i = 0; i<arr.length; i++)
        {
            set.add(arr[i]);
        }

        Integer [] result = set.toArray(new Integer [0]);

        return result;

    }

    public static void main(String [] A)
    {
        int[] iArr = {1,2,3,4,1,3,2,1,4,3,5};

        Integer [] iRet = removeDuplicates(iArr);

        System.out.println("After Duplicates removal : ");

        for(int i : iRet)
        {
            System.out.println(i+"\t");
        }
    }
}
