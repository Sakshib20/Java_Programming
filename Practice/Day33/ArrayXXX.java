// WAP to check common element in 2 arrays

import java.util.Vector;


public class ArrayXXX 
{
    public static Vector commonElem(int[] Arr, int[] Brr)
    {
        Vector<Integer> vec = new Vector<>();

        for(int i = 0; i<Arr.length; i++)
        {
            for(int j = 0; j<Brr.length; j++)
            {
                if(Arr[i] == Brr[j])
                {
                    vec.add(Arr[i]);
                    break;
                }
            }
        }

        return vec;
    }

    public static void main(String [] A)
    {
        int [] Arr = {1,2,3,4};
        int [] Brr = {2,3,4,1};

        Vector<Integer> vec = commonElem(Arr,Brr);   // generated warning because in return type we mentioned a generic vector and not a specific vector solved in next program 

        for(int i = 0; i<vec.size();i++)
        {
            System.out.print(vec.get(i)+" ");
        }
    }
}
