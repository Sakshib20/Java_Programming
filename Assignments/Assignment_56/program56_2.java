import java.util.*;
import java.io.*;

///////////////////////////////////////////////////////////
//
//  Function Name : OpenFile
//  Description : It opens a file and read data from the file
//  Input : String
//  Output : Void
//  Author : Sakshi Pradeep Bhapkar
//  Date : 01/02/2026
//
///////////////////////////////////////////////////////////
class FileX
{
    public void OpenFile(String FileName)throws Exception
    {
        boolean bRet = false;
        File fobj = null;
        FileReader frobj = null;

        fobj = new File(FileName);

        bRet = fobj.exists();

        if(bRet == true)
        {
            System.out.println("---File Opened Successfully---");
            frobj = new FileReader(FileName);

            char Buffer[] = new char[50];

            frobj.read(Buffer,0,20);

            System.out.println("Data from file is : "+new String(Buffer));
        }
        else
        {
            System.out.println("There is no such file");
        }

        if(frobj!=null)
        {
            frobj.close();
        }

    }
}
class program56_2
{
    public static void main(String A[]) throws Exception
    {
        String FileName = null;
        FileX cobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of file :");
        FileName = sobj.nextLine();

        cobj = new FileX();
        cobj.OpenFile(FileName); 

        sobj.close();
    }
}
     