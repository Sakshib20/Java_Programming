class Logic
{
    void findLargestDigit(int iNo)
    {
        int iDigit=0;
        int iMax=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            if(iMax<iDigit)
            {
                iMax=iDigit;
            }
            iNo=iNo/10;
        }

        System.out.println(iMax);
    }
}

// Time Complexity : O(N)

class program20_4
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.findLargestDigit(56821);
    }
}