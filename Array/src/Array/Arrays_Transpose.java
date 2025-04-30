package Array;

/*
 Topic : Transpose an array
 * Enter the elements of array as input. 
  We obtain the transpose of given matrix by 
 interchanging all the rows 
 and columns of a matrix with the help of loops.
 

Input Format:
The first input contains line related 2 (m*n) size of matrix -Enter the number of rows and columns
The second input contains space related integers m*n elements with white spaces

Output Format:
First output represents before transpose as per the given elements order
Second output represents after transpose interchange the all rows and columns.
 */



/*
Sample Input: 
3
3

1 2 3 4 5 6 7 8 9

Sample Output:
 
1 2 3  
4 5 6  
7 8 9  
 
1 4 7  
2 5 8  
3 6 9

Input 1:
5
5

12 30 40 50 60 70 80 90 100 110 120 130 140 150 160 170 180 190 200 210 220 230 240 250 520

Output 1:
12 30 40 50 60  
70 80 90 100 110  
120 130 140 150 160  
170 180 190 200 210  
220 230 240 250 520  

12 70 120 170 220  
30 80 130 180 230  
40 90 140 190 240  
50 100 150 200 250  
60 110 160 210 520 

Input 2:
2
2
10 20 30 40

Output 2:
10 20  
30 40  
10 30  
20 40

Input 3:
1
1
100

Output 3:
100  
100 

Input 4:
3
3
50 60 70 80 90 50 50 500 1000

Output 4:
50 60 70  
80 90 50  
50 500 1000  
50 80 50 

Input 5:
4
4
10000 20000 30000 40000 50000 60000 70000 80000 90000 100000 110000 120000 130000 140000 150000 160000

Output 5:
10000 20000 30000 40000  
50000 60000 70000 80000  
90000 100000 110000 120000  
130000 140000 150000 160000  
10000 50000 90000 130000  
20000 60000 100000 140000  
30000 70000 110000 150000  
40000 80000 120000 160000 
 
60 90 500  
70 50 1000

*/
import java.util.Scanner;
public class Arrays_Transpose
{
    public static void main(String args[])  
    {
	int i, j;
	//System.out.println("Enter total rows and columns: ");
	Scanner s = new Scanner(System.in);
	int row = s.nextInt();
	int column = s.nextInt();
	int array[][] = new int[row][column];
	//System.out.println("Enter matrix:");
 	for(i = 0; i < row; i++)
  	{
   	    for(j = 0; j < column; j++) 
     	    {
        	array[i][j] = s.nextInt();
        	System.out.print("");
            }
  	}
	//System.out.println("The above matrix before Transpose is ");
  	for(i = 0; i < row; i++)
    	{
      	    for(j = 0; j < column; j++)
            {
          	System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }
 	//System.out.println("The above matrix after Transpose is ");
  	for(i = 0; i < column; i++)
    	{
      	    for(j = 0; j < row; j++)
            {
                System.out.print(array[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
}
