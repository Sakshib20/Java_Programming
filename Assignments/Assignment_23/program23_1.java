import java.util.*;

class ArrayX
{
    private int Arr[];
    private int iSize;
    private int iNo;

    public ArrayX(int no)
    {
        iSize=no;
        Arr = new int[iSize];
        
    }

///////////////////////////////////////////////////////////
//
//  Function Name : Accept
//  Description : It accepts N numbers and a number to search if it's present or not
//  Input : Void
//  Output : Void
//  Author : Sakshi Pradeep Bhapkar
//  Date : 17/11/2025
//
///////////////////////////////////////////////////////////

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int i=0;

        System.out.println("Enter the elements of Array : ");

        for(i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }

        System.out.println("Enter element to check : ");
        iNo=sobj.nextInt();

    }

///////////////////////////////////////////////////////////
//
//  Function Name : Check
//  Description : Returns the if user defined number is present or not
//  Input : Void
//  Output : Boolean
//  Author : Sakshi Pradeep Bhapkar
//  Date : 17/11/2025
//
///////////////////////////////////////////////////////////

    public Boolean Check()
    {
        int i=0;
        Boolean bFlag=false;

        for(i=0;i<Arr.length;i++)
        {
           if(Arr[i]==iNo)
           {
                bFlag=true;
                break;
           }
        }
        
        return bFlag;
    }
}

class program23_1
{
    public static void main( String A[])
    {
        int iSize=0;
        Boolean bRet=false;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        iSize=sobj.nextInt();

        ArrayX aobj=new ArrayX(iSize);
        aobj.Accept();
        bRet=aobj.Check();

        if(bRet==true)
        {
            System.out.println("Present");
        }
        else
        {
            System.out.println("Absent");
        }
    }
}