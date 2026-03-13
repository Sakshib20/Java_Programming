import java.util.*;

class Number
{
    public long CalculateFactorial(int iNo)
    {
        int iCnt=0;
        long iFact=1;                       //Important

        if(iNo<0)
        {
            iNo=-iNo;
        }

        iCnt=1;

        while(iCnt<=iNo)
        {
            iFact=iFact*iCnt;
            iCnt++;
        }

        return iFact;

    }
} // End of Number class

class program89
{
    public static void main(String A[])
    {
        int iValue=0;
        long iRet=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue=sobj.nextInt();

        Number nobj=new Number();
        iRet=nobj.CalculateFactorial(iValue);

        System.out.println("Factorial is : "+iRet);

        //Important
        
        sobj=null;
        nobj=null;

        System.gc();
    }
}