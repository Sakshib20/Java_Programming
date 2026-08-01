//  sorting the array list

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_8
{

    public static void main(String [] A)
    {
        var aList = new ArrayList<Integer>();

        aList.add(4);
        aList.add(3);
        aList.add(5);
        aList.add(2);

        System.out.println("Before sorting : ");
        System.out.println(aList);

        Collections.sort(aList);

        System.out.println("After sorting : ");
        System.out.println(aList);

    }
}