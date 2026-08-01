//  adding element ar 1st position

import java.util.ArrayList;

public class ArrayList_3
{
    public static void main(String [] A)
    {
        var aList = new ArrayList<Integer>();

        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);
        
        aList.add(0,0);

        for(int elem : aList)
        {
            System.out.println(elem);
        }
    }
}