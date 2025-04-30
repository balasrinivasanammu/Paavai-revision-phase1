package Array;

import java.util.Scanner;

/*
Topic : Reverse thought
An array is a type of data structure that stores elements of the same type in a contiguous block of memory. In an array A of size N, each memory location has some unique index i,(Where 0<=i<=N) So that can be referenced as A[i] 

Reverse an array of integers.
Use the scanner class for getting the array size and array elements from the user.

Input constraint:
1<=N<=10^n

Input format
Example:
A=[1,2,3]
Returns [3,2,1]

Input Format

The first line contains an integer, , the number of integers in .
The second line contains  space-separated integers that make up .

Sample Input 1

4
1 4 3 2

Sample Output 1

2 3 4 1

Input 1:
5
10 20 30 40 50

Output 1:
50 40 30 20 10 

Input 2:
3
-5 9 -7

Output 2:
-7 9 -5
 
Input 3:
2
900 -900

Output 3:
-900 900

Input 4:
6
9 90 99 5 -5 55

Output 4:
55 -5 5 99 90 9

Input 5:
10
2 4 6 8 10 12 14 16 18 20

Output 5:
20 18 16 14 12 10 8 6 4 2 

  
  */
	public class Array_first {  
	    public static void main(String[] args) {  
	        //Initialize array  
	    	 Scanner input_size = new Scanner(System.in);
	         System.out.println("Enter the Size of Arrays : ");
	         int size = input_size.nextInt();
	         int[] arr = new int[size];
	         int total=0;
	         System.out.println("Enter the Array Elements: ");
	         for (int i = 0; i < size; i++) 
	         {
	        	 arr[i] = input_size.nextInt();
	        	 total=total+arr[i];
	        	 System.out.print(total);

	         }
		         
		        //System.out.print(total);
	    }  
	}
