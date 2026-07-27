// maximum sub array sum

class Array_X
{
    public static void main()
    {
        int[] Arr = {1,2,-3,0,3,4};
        int k = 3;

        int result = 0;

        int max = Integer.MIN_VALUE;

        for(int i = 0;i<k;i++)
        {
            result = result + Arr[i];
        }

        max = result;

        for(int i = k; i<Arr.length; i++)
        {
            int o = i - k;
            result = result + Arr[i] - Arr[o];

            if(result>max)
            {
                max = result;
            }
        }

        System.out.println(max);
    }
}