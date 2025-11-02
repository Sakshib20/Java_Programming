class Logic
{
    public void reverseNumber(int iNo)
    {
        int iDigit=0;
        int iCnt=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            System.out.println(iDigit);
            iNo=iNo/10;
        }
    }

// Time Complexity : O(N)
}

class program16_4
{
    public static void main(String args[])
    {
        Logic lObj= new Logic();
        lObj.reverseNumber(1234);
    }
}