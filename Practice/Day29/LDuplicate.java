import java.util.LinkedHashMap;

public class LDuplicate 
{
    public static void main(String[] A)
    {
        String str = new String("applle");
        str = str.toLowerCase();
        LinkedHashMap<Character, Integer> hMap = new LinkedHashMap<>();

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

        Character ch ='\0' ;

        for(Character key : hMap.keySet())
        {
            if(hMap.get(key).equals(2))
            {
                
               ch = key;
            }
        }

        System.out.println(ch + " : "+ hMap.get(ch));
    }
}
