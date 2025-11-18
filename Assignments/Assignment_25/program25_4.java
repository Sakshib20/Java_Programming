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
//  Function Name : Display
//  Description : Displays all the elements which are divisible by 3 and 5
//  Input : Void
//  Output : Void
//  Author : Sakshi Pradeep Bhapkar
//  Date : 18/11/2025
//
///////////////////////////////////////////////////////////

    public void Display()
    {
        int i=0;

        for(i=0;i<Arr.length;i++)
        {
            if((Arr[i]%3)==0  && (Arr[i]%5)==0)
            {
                System.out.println(Arr[i]);
            }
        }
    }
}

class program25_4
{
    public static void main( String A[])
    {
        int iSize=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        iSize=sobj.nextInt();

        ArrayX aobj=new ArrayX(iSize);
        aobj.Accept();

        System.out.println("Output : ");
        aobj.Display();
        
    }
}