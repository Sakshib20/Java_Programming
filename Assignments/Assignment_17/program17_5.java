class Logic
{
    public void printTable(int iNo)
    {
        int iCnt=0;

        for(iCnt=1;iCnt<=10;iCnt++)
        {
            System.out.println(iNo + "X" + iCnt + "=" + iNo*iCnt);
        }
        
    }
}
class program17_5
{
    public static void main(String args[])
    {
        Logic lObj=new Logic();
        lObj.printTable(5);
    }
}