//  remove the third element from the list

import java.util.ArrayList;

public class ArrayList_6
{

    public static void main(String [] A)
    {
        var aList = new ArrayList<Integer>();

        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);

        System.out.println("Before Removal : ");
        System.out.println(aList);
        
        // removing the 3rd element

        aList.remove(2);
        

        System.out.println("After Removal : ");
        System.out.println(aList);
    }
}