
public class Pattern5
{
    public static void main(String [] A)
    {
        int no = 1;
        for(int i = 0; i<5 ;i++)
        {
            for(int j = 0; j<=i; j++)
            {
                if((i+j)%2 == 0)
                {
                    System.out.print(0+" ");
                }
                else
                {
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
    }

}