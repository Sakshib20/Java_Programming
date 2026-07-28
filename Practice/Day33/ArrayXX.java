// checking if two arrays are same

import java.util.HashMap;

public class ArrayXX 
{
    public static boolean checkSame(int[] Arr, int[] Brr)
    {
        if(Arr.length != Brr.length)
        {
            return false;
        }

        HashMap<Integer,Integer> hmap = new HashMap<>();

        for(int i = 0; i<Arr.length; i++)
        {
            hmap.put(Arr[i],1);
        }

        for(int i = 0; i<Brr.length; i++)
        {
            if(hmap.containsKey(Brr[i]))
            {
                hmap.put(Brr[i],hmap.get(Brr[i])-1);
            }
            else
            {
                hmap.put(Brr[i],1);
            }

        }

        for(Integer keys : hmap.keySet())
        {
            if(hmap.get(keys) != 0)
            {
                return false;
            }
        }

        return true;

    }
    public static void main()
    {
        int [] Arr = {1,2,3,4};
        int [] Brr = {2,3,4,1};

        boolean Ret = checkSame(Arr,Brr);

        if(Ret)
        {
            System.out.println("Arrays are same");
        }
        else
        {
            System.out.println("Arrays are NOT Same");
        }
    }
}
