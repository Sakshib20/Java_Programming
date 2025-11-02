class Logic
{
    public void calculateSum(int iNo)
    {
        int iCnt=0;
        int iSum=0;

        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            iSum=iSum+iCnt;
        }

        System.out.println(iSum);
    }

// Time Complexity : O(N)
}

class program16_1
{
    public static void main(String args[])
    {
        Logic lObj= new Logic();
        lObj.calculateSum(10);
    }
}