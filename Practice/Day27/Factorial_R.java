
public class Factorial_R 
{
    public static int factorial(int no)
    {
        if(no == 0)
        {
            return 1;
        }

        int ifact = no * factorial(no-1);
        return ifact;
    }

    public static void main(String [] A)
    {
        int no = 3;
        int iRet = factorial(no);
        System.out.println(iRet);
    }
}
