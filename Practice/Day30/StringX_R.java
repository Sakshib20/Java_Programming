// first and last index of occurence

import java.util.Scanner;

public class StringX_R
{
    public static int first = -1;
    public static int last = -1;

    public static void Occurence(String str,int index, String ch)
    {
        if(index == str.length())
        {
            System.out.println(ch+" if first occured at : "+first+" and last occured at : "+last);
            return;
        }

        if(str.charAt(index)=='a')
        {
            if(first == -1)
            {
                first = index;
            }
            else
            {
                last = index;
            }
        }

        Occurence(str,index+1,ch);
    }

    public static void main(String [] A)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sc.next();

        str = str.toLowerCase();

        System.out.println("Enter the element to search : ");
        String ch = sc.next();

        ch = ch.toLowerCase();

        Occurence(str,0,ch);
        
    }
}
