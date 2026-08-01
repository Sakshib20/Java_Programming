//  Reverse the ArrayList

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_11
{

    public static void main(String [] A)
    {
        ArrayList<Integer> aList = new ArrayList<>();

        aList.add(4);
        aList.add(3);
        aList.add(5);
        aList.add(2);

        System.out.println("Before reversing : ");
        System.out.println(aList);

        Collections.reverse(aList);

        System.out.println("After reversing : ");
        System.out.println(aList);

    }
}