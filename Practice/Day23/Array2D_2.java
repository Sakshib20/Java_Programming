// matrix transpose

/*

input -> 1 2 3 
         4 5 6
         7 8 9 

ouput -> 1 4 7
         2 5 8
         3 6 9
*/

import java.util.Scanner;

public class Array2D_2 
{
    public static void main(String [] A)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Number of rows : ");
        int row = sc.nextInt();

        System.out.println("Number of columns : ");
        int col = sc.nextInt();

        int [][] mat = new int [row][col];

        System.out.println("Enter elements : ");

        for(int i = 0; i<row; i++)
        {
            for(int j = 0; j<col; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        int [][] transpose = new int[col][row];
        {
            for(int i = 0; i<col; i++)
            {
                for(int j = 0; j<row;j++)
                {
                    transpose[i][j]=mat[j][i];
                }
            }
        }

        System.out.println("Original Matrix : ");

        for(int i = 0; i<row; i++)
        {
            for(int j = 0; j<col; j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix : ");

        for(int i = 0; i<col; i++)
        {
            for(int j = 0; j<row; j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
}
