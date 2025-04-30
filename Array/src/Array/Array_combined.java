package Array;
/*Topic : Combine 2 set of departments
To combine the 2 set of department students on same class(Array).
Use the scanner class for getting the array size and array elements from the user.

Input constraint:
1<=N<=10^n

Input Format

The first line contains an integer,- Enter the Size of Arrays
The second line contains  space-separated integers .
The third line contains  space-separated integers .

Sample Input:

2

10 20

30 40

Sample Output: 
10 20 30 40 

Input 1:
5
20 300 400 800 9000
500 600 7000 8000 1000

Output 1:
20 300 400 800 9000 500 600 7000 8000 1000 

Input 2:
2
-200 -300
-400 -500

Output 2:
-200 -300 -400 -500

Input 3:
10
-1 1 -2 2 -3 3 -4 4 -5 5
-6 6 -7 7 -8 8 -9 9 -10 10

Output 3:
-1 1 -2 2 -3 3 -4 4 -5 5 -6 6 -7 7 -8 8 -9 9 -10 10 

Input 4:
3
-7 8000000 9
900 -8 50

Output 4:
-7 8000000 9 900 -8 50

Input 5:
1
20
30

Output 5:
20 30


 */
import java.util.Scanner;

public class Array_combined {
	   public static void main(String[] args) {
		   Scanner input_size = new Scanner(System.in);
	        System.out.println("Enter the Size of Arrays : ");
	        int size = input_size.nextInt();
	        int[] array1 = new int[size], array2 = new int[size],array3 = new int[size];
	        System.out.println("Enter the CSE student marks: ");
	        for (int i = 0; i < size; i++) {
	            array1[i] = input_size.nextInt();
	        }
	        System.out.println("Enter the ECE students marks: ");
	        for (int i = 0; i < size; i++) {
	            array2[i] = input_size.nextInt();
	        }
	        
	     
	      array3 = new int[array1.length+array2.length];
	      int count = 0;
	      
	      for(int i = 0; i < array1.length; i++) { 
	    	  array3[i] = array1[i];
	         count++;
	      } 
	      int count2=count;
	      for(int j = 0; j < array2.length;j++) { 
	    	  array3[count++] = array2[j];
	    	  count2++;
	      }
	      
	      System.out.println("After combined: ");
	      for(int i = 0;i < array3.length;i++) {
	    	  System.out.print(array3[i]+" ");
	      }
	      
	   } 
	}
