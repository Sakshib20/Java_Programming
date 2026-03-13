import java.util.*;

class Number
{
    public boolean CheckPerfect(int iNo)
    {
        int iDigit=0;
        int iSum=0;
        int i=iNo;

        while(iNo!=0)
        {
            iDigit=iNo%10;

            if(iNo%iDigit==0)
            {
                iSum=iSum+iDigit;
            }
            iNo=iNo/10;
        }

        if(iSum==i)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
} // End of Number class

class program79
{
    public static void main(String A[])
    {
        int iValue=0;
        boolean bRet=false;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue=sobj.nextInt();

        Number nobj=new Number();
        bRet=nobj.CheckPerfect(iValue);

        if(bRet==true)
        {
            System.out.println(iValue+" is perfect number");
        }
        else
        {
            System.out.println(iValue+" is not a perfect number");
        }

        //Important
        
        sobj=null;
        nobj=null;

        System.gc();
    }
}