class Logic
{
    void checkLeapYear(int iYear)
    {
        if(iYear%4==0)
        {
            if(iYear%100==0)
            {
                if(iYear%400==0)
                {
                    System.out.println("Leap Year");
                }
                else
                {
                    System.out.println("Not Leap Year");
                }
            }
            else
            {
                System.out.println("Leap Year");
            }
        }
        else
        {
            System.out.println(" Not Leap Year");
        }
    }
}

class program19_1
{
    public static void main(String A[])
    {
        Logic lobj=new Logic();
        lobj.checkLeapYear(2024);
    }
}