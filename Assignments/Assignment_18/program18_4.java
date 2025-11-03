class Logic
{
    void sumEvenOddDigits(int iNo)
    {
        int iCnt=0;
        int iDigit=0;
        int iEsum=0;
        int iOsum=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;

            if(iDigit%2==0)
            {
                iEsum=iEsum+iDigit;
            }
            else
            {
                iOsum=iOsum+iDigit;
            }

            iNo=iNo/10;
        }

        System.out.println("Sum of Even Digits is : "+iEsum);
        System.out.println("Sum of Odd Digits is : "+iOsum);
    }
}

// Time Complexity : O(N)

class program18_4
{
    public static void main(String args[])
    {
        Logic lObj=new Logic();
        lObj.sumEvenOddDigits(123456);
    }
}