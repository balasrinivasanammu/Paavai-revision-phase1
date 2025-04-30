package Array;
/* 
 * Topic : Covid-19 Box section
 We planned to provide medical treatment for corona affected people. In this case we have to create separate 'm*n' queues for them. According to the m*n conditions only people allowed to take treatment.
 
Use the scanner class for getting the input from the user whereas creating the matrix.

Input Format:
The first input contains an integer-Enter Number of Rows for Array (max 5)
The second input contains space-separated integers- Enter Number of Columns for Array (max 5)
The 3rd input contains(n*n) space separated array values

  
Sample Input:
Enter Number of Rows for Array (max 5) : 2
Enter Number of Columns for Array (max 5) : 2
Enter 4 Array Elements : 
1
2
3
3

Sample Output:
TheArray is :
1  2  
3  3 

Input 1:
3
3
1 2 3 4 5 6 7 8 9

Output 1:
1  2  3  
4  5  6  
7  8  9 

Input 2:
4
1 
5 6 7 9

 Output 2:
5  
6  
7  
9

Input 3:
2
2
10 -20 30 40

Output 3:
10  -20  
30  40 

Input 4:
2
2
-100 -200 -700 -800

Output 4:
-100  -200  
-700  -800 

 Input 5:
 1
 1
 100
 
 Output 5:
 100
 

 */

import java.util.Scanner;

public class Array_multiqueuecreate
{
   public static void main(String args[])
   {
       int row, col, i, j;
       int arr[][] = new int[10][10];
       Scanner scan = new Scanner(System.in);
	   
       //System.out.print("Enter Number of Rows for Array (max 5) : ");
       row = scan.nextInt();
       //System.out.print("Enter Number of Columns for Array (max 5) : ");
       col = scan.nextInt();
	   
       //System.out.println("Enter " +(row*col)+ " Array Elements : ");
       for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
               arr[i][j] = scan.nextInt();
           }
       }
	   
       //System.out.print("The Array is :\n");
       for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
               System.out.print(arr[i][j]+ "  ");
           }
           System.out.println();
       }
   }
}
