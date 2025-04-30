package Array;

import java.util.Scanner;

/*Topic : Police Training - Filter top most height  
 Police training is going on. 5 persons are filtered on physical test. Then finally,We have to short list the single candidate according to them heights.
  
Input format:
First line input - Enter the size of an array
Second line inputs - Enter the number of elements

Sample Input:
5
10 6 5 4 60

Sample Output:
60

Input 1:
2
10 20

Output 1:
20

Input 2:
3
-500 600 400

Output 2:
600

Input 3:
5
1 2 3 04 5

Output 3:
5

Input 4:
8
10 20 30 40 50 60 70 80 5

Output 4:
80

Input 5:
1
100

Output 5:
100
 */
public class Biggest_elements 
{ 
	public static void main(String[] args)  
    { 
	Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int candidate_height[] = new int[n];
    for(int i = 0; i < n; i++)
    {
    	candidate_height[i] = s.nextInt();
    }
     //static int candidate_height[] = {10, 6, 5, 4, 60}; 
        
    // static int largest() 
     //{ 
         int i; 
           
         // Initialize maximum element 
         int max = candidate_height[0]; 
           
         for (i = 1; i < candidate_height.length; i++) 
             if (candidate_height[i] < max) 
                 max = candidate_height[i]; 
        
         //return max; 
    // } 
       
     
         System.out.println(max); 
        } 
 }
