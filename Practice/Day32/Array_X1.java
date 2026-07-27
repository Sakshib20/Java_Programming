// finding and print maximum number in each k elements from array

public class Array_X1 
{
    public static void main()
    {
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
        System.out.println(max);

        for(int i = 1; i<Arr.length-k+1; i++)
        {
            for(int j = i; j<k+i; j++)
            {
                if(Arr[j]>max)
                {
                    max = Arr[j];
                }
            }

            System.out.println(max);

        }

        

        
    }
}
