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
//  Description : It accepts N numbers 
//  Input : Void
//  Output : Void
//  Author : Sakshi Pradeep Bhapkar
//  Date : 18/11/2025
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
//  Function Name : Product
//  Description : Returns product of all odd elements
//  Input : Void
//  Output : Integer
//  Author : Sakshi Pradeep Bhapkar
//  Date : 18/11/2025
//
///////////////////////////////////////////////////////////

    public int Product()
    {
        int i=0, iMult=1;

        for(i=0;i<Arr.length;i++)
        {
           if((Arr[i]%2)!=0)
           {    
               iMult=iMult*Arr[i]; 
           }
        }

        return iMult;
    }
}

class program23_5
{
    public static void main( String A[])
    {
        int iSize=0, iRet;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        iSize=sobj.nextInt();

        ArrayX aobj=new ArrayX(iSize);
        aobj.Accept();
        
        iRet=aobj.Product();

        if(iRet==1)
        {
            System.out.println("Product of odd elements is : 0");
        }
        else
        {
            System.out.println("Product of odd elements is : "+iRet);
        }
    }
}