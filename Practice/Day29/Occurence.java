import java.util.HashMap;

public class Occurence {

    public static void main(String [] A)
    {
        HashMap<Character,Integer> hMap = new HashMap<>();

        String str = new String("Hello");

        for(int i = 0; i<str.length();i++)
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

        for(Character key : hMap.keySet())
        {
            System.out.println(key + ":"+hMap.get(key));
        }
  
    }
    
}
