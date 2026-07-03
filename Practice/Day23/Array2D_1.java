// spriral traversal of matrix

/*

input -> 1 2 3 4
         5 6 7 8
         3 4 5 6

ouput -> 1 2 3 4 8 5 4 3 5 6 7 
*/

import java.util.Scanner;

public class Array2D_1 
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

        int left = 0, right = col-1, top = 0, bottom = row-1;

        while(left<=right && top<=bottom)
        {
            for(int i = left; i<=right; i++)
            {
                System.out.print(mat[top][i]+" ");
            }
            top++; // top->1

            for(int i = top; i<=bottom; i++)
            {
                System.out.print(mat[i][right]+" ");
            }
            right--; // right -> 2

            for(int i = right; i>= left; i--)
            {
                System.out.print(mat[bottom][i]+" ");
            }
            bottom--;   // bottom -> 1

            for(int i = bottom; i>=top; i--)
            {
                System.out.print(mat[i][left]+" ");
            }
            left++;  // left->1
        }
    }
}
