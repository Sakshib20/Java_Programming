// input : Hello
// output : _ello

import java.util.*;
class StringX
{
    public String Update(String str)
    {
        char Arr[] = str.toCharArray();

        Arr[0]='_';

        return new String(Arr);             //Changed
    }
}

class program253
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);
        String sRet = null;

        System.out.println("Enter String : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
         
        sRet=strobj.Update(sobj);
        System.out.println("Update String : "+sRet);
    }
}