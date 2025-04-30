package Array;
/*
 * Topic: Sum of Employee salary - matrix
 To create the single matrix and store employees salary on it. Then accumulate(add) the employees salary which is presented on row wise as well as column wise.     

Input Format:
The first input contains an integer-Enter number of rows in first matrix
The second input contains space related integers -Enter number of rows in second matrix
The 3rd input contains m*n integers

Sample Input:
2
3
10 20 30 40 50 60

Sample Output:
60
150
50
70
90

Input 1:
2
2
100 200 300 400

Output 1:
300
700
400
600

Input 2:
1
1
100

Output 2:
100
100


Input 3:
4
4
100 200 300 400 500 600 700 800 900 1000 1100 1200 1300 1400 1500 1600

Output 3:
1000
2600
4200
5800
2800
3200
3600
4000

Input 4:
3
3
-100 -200 -300 -400 -500 -600 -700 -800 -900

Output 4:
-600
-1500
-2400
-1200
-1500
-1800

Input 5:
2
2
-100 100 -200 200

Output 5:
0
0
-300
300


 */

import java.util.Scanner;
public class Arrays_matricsadd
{
	 public static void main(String[] args) {    
	        int rows, cols, sumRow, sumCol;    
	        int p, q, m, n;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter number of rows in first matrix:");
	        p = s.nextInt();
	        System.out.print("Enter number of columns in first matrix:");
	        q = s.nextInt(); 
	        int a[][] = new int[p][q];
            
            
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    a[i][j] = s.nextInt();
                }
            }
	     
	          //Calculates number of rows and columns present in given matrix    
	          rows = a.length;    
	        cols = a[0].length;    
	            
	        //Calculates sum of each row of given matrix    
	        for(int i = 0; i < rows; i++){    
	            sumRow = 0;    
	            for(int j = 0; j < cols; j++){    
	              sumRow = sumRow + a[i][j];    
	            }    
	            System.out.println(sumRow);    
	        }    
	            
	        //Calculates sum of each column of given matrix    
	        for(int i = 0; i < cols; i++){    
	            sumCol = 0;    
	            for(int j = 0; j < rows; j++){    
	              sumCol = sumCol + a[j][i];    
	            }    
	            System.out.println(sumCol);    
	        }    
	    }    
}
