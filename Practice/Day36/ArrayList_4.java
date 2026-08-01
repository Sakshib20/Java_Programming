//  Iterating elements by index

import java.util.ArrayList;

public class ArrayList_4
{
    public static void main(String [] A)
    {
        var aList = new ArrayList<Integer>();

        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);
        
        aList.add(0,0);

        for(int i = 0; i<aList.size();i++)
        {
            System.out.println(aList.get(i));
        }
    }
}