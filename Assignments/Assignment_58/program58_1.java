package Assignments.Assignment_58;

import java.util.*;
import java.io.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : DisplayFiles
//  Description : It accepts directory name from user and displays names files which are regular files
//  Input : String
//  Output : Void
//  Author : Sakshi Pradeep Bhapkar
//  Date : 05/02/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class FileX
{
    public void ListFiles(String DirectoryName)
    {
        File fobj = new File(DirectoryName);
        if(fobj.exists() && fobj.isDirectory())
        {
            File fArr[] = fobj.listFiles();
            for(int i = 0; i<fArr.length; i++)
            {
                System.out.println("Regular files from the directory are : ");
                if(fArr[i].isFile())
                {
                    System.out.println(fArr[i]);
                }
            }
        }
        else
        {
            System.out.println("No such Directory found");
        }
    }
}

public class program58_1 
{
    public static void main(String A[])
        {
            Scanner sobj = new Scanner(System.in);
            String Dname = null;

            System.out.println("Enter the name of directory : ");
            Dname = sobj.nextLine();

            FileX cobj = new FileX();
            cobj.ListFiles(Dname);

            sobj.close();
        }
    
}
