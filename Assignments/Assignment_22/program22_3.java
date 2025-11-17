import java.util.*;

class ArrayX
{
    private int Arr[];
    private int iSize;

    public ArrayX(int no)
    {
        iSize=no;
        Arr = new int[iSize];
        
    }

///////////////////////////////////////////////////////////
//
//  Function Name : Accept
//  Description : It accepts N numbers from user
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
    }

///////////////////////////////////////////////////////////
//
//  Function Name : Check
//  Description : Checks whether 11 is present or not
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
           if(Arr[i]==11)
           {
                bFlag=true;
           } 
        }

        return bFlag;
    }
}

class program22_3
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
            System.out.println("11 is present");
        }
        else
        {
            System.out.println("11 is absent");
        }
        
    }
}