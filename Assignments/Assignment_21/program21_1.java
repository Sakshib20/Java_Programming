class Logic
{
    void productOfDigits(int iNo)
    {
        int iDigit=0;
        int iMult=1;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            iMult=iMult*iDigit;
            iNo=iNo/10;
        }

        System.out.println(iMult);
    }
}

// Time Complexity : O(N)

class program21_1
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.productOfDigits(234);
    }
}