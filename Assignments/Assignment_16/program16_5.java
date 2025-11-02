class Logic
{
    public void countDigits(int iNo)
    {
        int iDigit=0;
        int iCnt=0;
        int iFreq=0;

        while(iNo!=0)
        {
            iDigit=iNo%10;
            iFreq++;
            iNo=iNo/10;
        }
        System.out.println(iFreq);
    }

// Time Complexity : O(N)
}

class program16_5
{
    public static void main(String args[])
    {
        Logic lObj= new Logic();
        lObj.countDigits(7865);
    }
}