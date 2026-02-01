package Assignments.Assignment_57;

import java.util.*;
import java.io.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : CpyData
//  Description : It accepts source file name and destination file name from user and copies the data from source to destination file
//  Input : String, String
//  Output : Void
//  Author : Sakshi Pradeep Bhapkar
//  Date : 01/02/2026
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class FileX
{
    public void CpyData(String srcFile, String destFile) throws Exception
    {
        File fsobj = null, fdobj = null;
        byte Buffer[] = new byte[100];

        int iRet = 0;

        fsobj = new File(srcFile);
        fdobj = new File(destFile);

        if(fsobj.exists())
        {
            System.out.println("Source file exists \nCopying data to destination file");

            fdobj.createNewFile();

            FileInputStream fiobj = new FileInputStream(fsobj);
            FileOutputStream foobj = new FileOutputStream(fdobj);

            while((iRet = fiobj.read(Buffer))!=-1)
            {
                foobj.write(Buffer,0,iRet);
            }

            System.out.println("File copying successfull");

            fiobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("There is no source file");
        }
    }
}

class program57_1
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String src = null, dest = null;

        System.out.println("Enter the name of source file : ");
        src = sobj.nextLine();

        System.out.println("Enter the name of destination file : ");
        dest = sobj.nextLine();

        FileX cobj = new FileX();
        cobj.CpyData(src, dest);

        sobj.close();

    }
}