// finding maximum number in each k elements from array and keeping that in an array

import java.util.Vector;

public class Array_X2 
{
    public static void main()
    {
        Vector<Integer> vec = new Vector<>();
        int[] Arr = {1,2,-3,0,3,4};
        int k = 3;

        int max = Integer.MIN_VALUE;

        for(int i = 0;i<k;i++)
        {
            if(Arr[i]>max)
            {
                max = Arr[i];
            }

        }

        vec.add(max);


        for(int i = 1; i<Arr.length-k+1; i++)
        {
            for(int j = i; j<k+i; j++)
            {
                if(Arr[j]>max)
                {
                    max = Arr[j];
                }
            }

            vec.add(max);

        }

        for(int elem : vec)
        {
            System.out.print(elem+" ");
        }
        
    }
}
