import java.util.Scanner;

public class MatrixDiagonal 
{
    public static int diagonalSum(int arr[][], int row, int col)
    {
        int Sum = 0;
        for(int i = 0, j = col-1 ; i<row ; i++, j--)
        {
            Sum = Sum + arr[i][i];
            if(i+j == col-1)
            {
                Sum = Sum + arr[i][j];
            }
        }
        

        return Sum;
    }

    public static void main(String [] A)
    {
        Scanner sobj = new Scanner(System.in);

        int iRow, iCol;

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();

        int[][] Arr = new int[iRow][iCol];

        System.out.println("Enter elements : ");

        for(int i = 0; i<iRow; i++)
        {
            for(int j = 0; j<iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        int iRet = diagonalSum(Arr,iRow, iCol);

        System.out.println("Sum : "+iRet);
        sobj.close();
    }
}
