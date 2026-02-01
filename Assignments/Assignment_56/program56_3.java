import java.util.*;
import java.io.*;

///////////////////////////////////////////////////////////
//
//  Function Name : AppendFile
//  Description : It writes in the file from end
//  Input : String
//  Output : Void
//  Author : Sakshi Pradeep Bhapkar
//  Date : 01/02/2026
//
///////////////////////////////////////////////////////////
class FileX
{
    public void AppendFile(String FileName)throws Exception
    {
        File fobj = null;
        FileOutputStream foobj = null;

        String str = null;

        fobj = new File(FileName);

        if( fobj.exists())
        {
            byte Arr[] = new byte[50];

            foobj = new FileOutputStream(fobj,true);
            str = "Jay Ganesh...";

            Arr = str.getBytes();
            foobj.write(Arr);

            System.out.println("Writting successfully done");
        }

        else
        {
            System.out.println("There is no such file");
        }

    }
}
class program56_3
{
    public static void main(String A[]) throws Exception
    {
        String FileName = null;
        FileX cobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of file :");
        FileName = sobj.nextLine();

        cobj = new FileX();
        cobj.AppendFile(FileName); 

        sobj.close();
    }
}
     