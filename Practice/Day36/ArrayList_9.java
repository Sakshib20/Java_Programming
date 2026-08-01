//  copying array list to another array list

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_9
{

    public static void main(String [] A)
    {
        ArrayList<Integer> aList = new ArrayList<>();
        ArrayList<Integer> aList2 = new ArrayList<>();

        aList.add(4);
        aList.add(3);
        aList.add(5);
        aList.add(2);

        aList2.add(0);
        aList2.add(0);
        aList2.add(0);
        aList2.add(0);


        System.out.println("Before copying : ");
        System.out.println(aList2);

        Collections.copy(aList2,aList);

        System.out.println("After copying : ");
        System.out.println(aList2);

    }
}