class Logic
{
    void printlnDigits(int iNo)
    {
        int iDigit=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            System.out.println(iDigit);
            iNo=iNo/10;
        }
    }
}

// Time Complexity : O(N)

class program19_4
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.printlnDigits(9876);
    }
}