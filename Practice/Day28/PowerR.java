public class PowerR {

    public static int calPow(int num, int n)
    {
        if(n == 0)
        {
            return 1;
        }

        if(num == 0)
        {
            return 0;

        }

        int pow = num * calPow(num,n-1);
        return pow;
    }

    public static void main(String [] A)
    {
        int iRet = calPow(2,3);
        System.out.println(iRet);
    }
    
}
