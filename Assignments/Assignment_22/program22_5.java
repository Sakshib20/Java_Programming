import java.util.*;

class ArrayX
{
    private int Arr[];
    private int iSize;
    private int iElem;

    public ArrayX(int no)
    {
        iSize=no;
        Arr = new int[iSize];
        
    }

///////////////////////////////////////////////////////////
//
//  Function Name : Accept
//  Description : It accepts N numbers and a number to search it's frequency from user
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

        System.out.println("Enter element to check frequency: ");
        iElem=sobj.nextInt();

    }

///////////////////////////////////////////////////////////
//
//  Function Name : Frequency
//  Description : Returns the Frequency of user defined number
//  Input : Void
//  Output : Integer
//  Author : Sakshi Pradeep Bhapkar
//  Date : 17/11/2025
//
///////////////////////////////////////////////////////////

    public int Frequency()
    {
        int i=0, iCnt=0;

        for(i=0;i<Arr.length;i++)
        {
           if(Arr[i]==iElem)
           {
                iCnt++;
           }
        }
        
        return iCnt;
    }
}

class program22_5
{
    public static void main( String A[])
    {
        int iSize=0, iRet=0;
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        iSize=sobj.nextInt();

        ArrayX aobj=new ArrayX(iSize);
        aobj.Accept();
        iRet=aobj.Frequency();

        System.out.println("Frequency is : "+iRet);
    }
}