//  extracting the sublist

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_12
{

    public static void main(String [] A)
    {
        ArrayList<Integer> aList = new ArrayList<>();

        aList.add(4);
        aList.add(3);
        aList.add(5);
        aList.add(2);

        var l2 = new ArrayList<Integer>(aList.subList(0,3));
       
        System.out.println(l2);

    }
}