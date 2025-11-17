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
//  Function Name : CountEven
//  Description : Returns Frequency of Even numbers
//  Input : Void
//  Output : Integer
//  Author : Sakshi Pradeep Bhapkar
//  Date : 17/11/2025
//
///////////////////////////////////////////////////////////

    public int CountEVen()
    {
        int i=0, iEven=0;
        for(i=0;i<Arr.length;i++)
        {
           if((Arr[i]%2)==0)
           {
            iEven++;
           }
        }
        return iEven;
    }
}

class program22_1
{
    public static void main( String A[])
    {
        int iSize=0, iRet=0;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        iSize=sobj.nextInt();

        ArrayX aobj1=new ArrayX(iSize);
        aobj1.Accept();
        iRet=aobj1.CountEVen();

        System.out.println("Frequency of even numbers is : "+iRet);
    }
}