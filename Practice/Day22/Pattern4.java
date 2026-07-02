
public class Pattern4
{
    public static void main(String [] A)
    {
        for(int i = 0; i<5 ;i++)
        {
            for(int j = 5; j<5-i; j++)
            {
                System.out.print(" ");
            }

            for(int j = 0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}