class Logic
{
    public void findMax(int iNo1, int iNo2)
    {
        if(iNo1>iNo2)
        {
            System.out.println(iNo1);
        }
        if(iNo2>iNo1)
        {
            System.out.println(iNo2);
        }
        
    }
}
class program17_3
{
    public static void main(String args[])
    {
        Logic lObj=new Logic();
        lObj.findMax(20, 15);
    }
}