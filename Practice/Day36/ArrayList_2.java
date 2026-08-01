//  Iterating array list elements

import java.util.ArrayList;

public class ArrayList_2
{
    public static void main(String [] A)
    {
        var aList = new ArrayList<Integer>();

        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);
        aList.add(5);

        for(int elem : aList)
        {
            System.out.println(elem);
        }
    }
}