public class Solution_X 
{
    public static int countGold(String coins)
    {
        int nb = 0, ns = 0, ng = 0;

        for(int i = 0; i<coins.length();i++)
        {
            if(coins.charAt(i)=='b')
            {
                nb++;
            }
            else if(coins.charAt(i)=='s')
            {
                ns++;
            }
            else if(coins.charAt(i)=='g')
            {
                ng++;
            }
        }

        ns = ns + nb/3;
        ng = ng + ns/3;

        return ng;
    }

    public static void main(String [] A)
    {
        String coins = "ssbbbg";

        int ret = countGold(coins);
        System.out.println(ret);
    }
}
