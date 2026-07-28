// Find first non repeating character in string

//Functional approach



import java.util.HashMap;
import java.util.Scanner;

public class ArrayX{

    public static char firstNonRepeat(String str)
    {
        HashMap<Character,Integer> hmap = new HashMap<>();

        for(int i = 0; i<str.length(); i++)
        {
            if(hmap.containsKey(str.charAt(i)))
            {
                hmap.put(str.charAt(i),hmap.get(str.charAt(i))+1);
            }
            else
            {
                hmap.put(str.charAt(i),1);
            }
        }

        char ch = '\0';

        for(Character keys : hmap.keySet())
        {
            if(hmap.get(keys)==1)
            {
                ch = keys;
                break;
            }
        }

        return ch;

    }
    public static void main(String[]A)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sc.next();
        
        char Ret = firstNonRepeat(str);
        System.out.println(" first non repeating character is : "+Ret);
        
    }
    
}
