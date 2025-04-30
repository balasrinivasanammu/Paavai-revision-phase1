package Array;
/*
Topic:Interchage Diagonals
Enter the elements of array as input. Now we use loops and if else condition to interchange the two diagonals of the matrix.
Matrix of Order MxN & Interchange the Diagonals. 

Input Format:
The first input contains an integer-Enter number of rows in matrix
The second input contains space related integers -Enter number of columns in matrix
The 3rd input contains-Enter the elements m*n
/*
Sample Input:
2
2
10 20 30 40

Sample Output:
20 10 
40 30

Input 1:
3
3
1 2 3 4 5 6 7 8 9 

Output 1:
3 2 1 
4 5 6 
9 8 7 

Input 2:
2
2
1 2 3 4 

Output 2:
2 1 
4 3

Input 3:
4
4
-100 200 300 400 500 600 700 800 900 1000 1100 1200 1300 1400 1500 1600

Output 3:
400 200 300 -100 
500 700 600 800 
900 1100 1000 1200 
1600 1400 1500 1300 
  */
 
import java.util.Scanner;
public class Arrays_interchangediagonals
{
    public static void main(String[] args) 
    {
        int p, q, temp = 0;
        Scanner s = new Scanner(System.in);
        //System.out.print("Enter number of rows in matrix:");
        p = s.nextInt();
        //System.out.print("Enter number of columns in matrix:");
        q = s.nextInt();
        if (p == q) 
        {
            int a[][] = new int[p][q];
            //System.out.println("Enter all the elements of matrix:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    a[i][j] = s.nextInt();
                }
            }
            /*System.out.println("Given Matrix:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
             }*/
            for(int j = 0; j < q; j++)
            {
                temp = a[j][j];
                a[j][j] = a[j][q-1-j];
                a[j][q-1-j] = temp;
            }
            //System.out.println("Matrix after interchanging diagonals");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
        } 
        else 
        {
            System.out.println("Rows not equal to column");
        }
    }
}