class Logic
{
    public void checkPrime(int iNo)
    {
        int iCnt=0;
        int iFreq=0;

        for(iCnt=2;iCnt<=(iNo/2);iCnt++)
        {
            if(iNo%iCnt==0)
            {
                iFreq++;
            }
        }
        if(iFreq==0)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}

// Time Complexity : O(N/2)

class program18_1
{
    public static void main(String args[])
    {
        Logic lObj=new Logic();
        lObj.checkPrime(11);
    }
}