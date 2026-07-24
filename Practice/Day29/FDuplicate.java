import java.util.HashMap;

public class FDuplicate 
{
    public static void main(String[] A)
    {
        String str = new String("Application");
        str = str.toLowerCase();
        HashMap<Character, Integer> hMap = new HashMap<>();

        for(int i = 0; i<str.length(); i++)
        {
            if(hMap.containsKey(str.charAt(i)))
            {
                hMap.put(str.charAt(i),hMap.get(str.charAt(i))+1);
            }
            else
            {
                hMap.put(str.charAt(i),1);
            }
        }

        for(int i = 0; i<str.length(); i++)
        {
            if(hMap.get(str.charAt(i)).equals(2))
            {
                System.out.println(str.charAt(i)+" : "+hMap.get(str.charAt(i)));
                break;
            }
        }
    }
}
