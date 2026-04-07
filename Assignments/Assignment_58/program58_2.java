package Assignments.Assignment_58;

import java.util.*;
import java.io.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : CpyName
//  Description : It accepts directory name from user and copy all the files name from that directory into Marvellous.txt
//  Input : String
//  Output : Void
//  Author : Sakshi Pradeep Bhapkar
//  Date : 05/02/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class FileX
{
    public void CpyFName(String DirectoryName) throws Exception
    {
        byte Buffer[] = new byte[1024];
        FileInputStream fiobj = null;
        File fobj1 = new File("Marvellous.txt");
        fobj1.createNewFile();
        FileOutputStream foobj = new FileOutputStream(fobj1);
        File fobj2 = new File(DirectoryName);
        if(fobj2.exists() && fobj2.isDirectory())
        {
            File fArr[] = fobj2.listFiles();
            for(int i = 0; i<fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);
                Buffer = fArr[i].getName().getBytes();
                foobj.write(Buffer);
            }
            fiobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("No such directory found");
        }
    }
}

public class program58_2  
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of directory : ");
        String DName = sobj.nextLine();

        FileX cobj = new FileX();

        cobj.CpyFName(DName);

        sobj.close();
    }
}
