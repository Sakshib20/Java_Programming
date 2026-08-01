//  searching an element in the list

import java.util.ArrayList;

public class ArrayList_7
{

    public static void main(String [] A)
    {
        var aList = new ArrayList<Integer>();

        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);

        if(aList.contains(3))
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}