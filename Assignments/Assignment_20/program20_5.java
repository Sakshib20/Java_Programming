class Logic
{
    void findSmallestDigit(int iNo)
    {
        int iDigit=0;
        int iMin=10;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            if(iMin>iDigit)
            {
                iMin=iDigit;
            }
            iNo=iNo/10;
        }

        System.out.println(iMin);
    }
}

// Time Complexity : O(N)

class program20_5
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.findSmallestDigit(56182);
    }
}