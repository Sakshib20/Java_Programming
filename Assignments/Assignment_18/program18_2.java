class Logic
{
    void printEvenNumbers(int iNo)
    {
        int iCnt=0;
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            if(iCnt%2==0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

// Time Complexity : O(N)

class program18_2
{
    public static void main(String args[])
    {
        Logic lObj=new Logic();
        lObj.printEvenNumbers(20);
    }
}