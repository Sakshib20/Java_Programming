//  Update arraylist element by given element

import java.util.ArrayList;

public class ArrayList_5
{

    public static void main(String [] A)
    {
        var aList = new ArrayList<Integer>();

        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);

        System.out.println("Before updation : ");
        System.out.println(aList);
        
        // update element 3 by 5
        aList.set(2,5);

        System.out.println("After updation : ");
        System.out.println(aList);
    }
}