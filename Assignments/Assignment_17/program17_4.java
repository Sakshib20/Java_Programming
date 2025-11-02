class Logic
{
    public void findMin(int iNo1, int iNo2, int iNo3)
    {
        if(iNo1<iNo2 && iNo1<iNo3)
        {
            System.out.println(iNo1);
        }
        if(iNo2<iNo1 && iNo2<iNo3)
        {
            System.out.println(iNo2);
        }
        if(iNo3<iNo1 && iNo3<iNo2)
        {
            System.out.println(iNo3);
        }
        
    }
}
class program17_4
{
    public static void main(String args[])
    {
        Logic lObj=new Logic();
        lObj.findMin(3, 7, 2);
    }
}