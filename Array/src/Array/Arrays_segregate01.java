package Array;


/* Topic: Split Ill(0) & Non-Ill(1)
To Split all 0s on left side and all 1s on right side of a given array of 0s and 1s.

Input Format:
The first input contains an integer-Enter the number of 0's and  1's
The second input contains space related integers -Enter 0's and 1's with white spaces

Output Format:
First output print 0's and 1's as per the given order along with square brackets.
Print 0's and 1's along with square brackets.

Sample Input:
5
0 1 1 0 1

Sample Output:
[0, 1, 1, 0, 1]
[0, 0, 1, 1, 1]

Input 1:
2
0 1

Output 1:
[0, 1]
[0, 1]

Input 2:
4
1 0 1 0

Output 2:
[1, 0, 1, 0]
[0, 0, 1, 1]

Input 3:
6
1 1 1 1 1 0

Output 3:
[1, 1, 1, 1, 1, 0]
[0, 1, 1, 1, 1, 1]

Input 4:
1
0

Output 4:
[0]
[0]

Input 5:
6
1 1 1 1 1 1

Output 5:
[1, 1, 1, 1, 1, 1]
[1, 1, 1, 1, 1, 1]
*/

import java.util.*;
//import java.lang.*;
public class Arrays_segregate01
{
   public static void main (String[] args) 
    {  
	   Scanner s = new Scanner(System.in);
       //System.out.print("Enter the number of 0's and  1's:");
       int n = s.nextInt();
       //String names[] = new String[n];
       Scanner s1 = new Scanner(System.in);
       //System.out.println("Enter 0's and 1's with white spaces:");
       int nums[] = new int[n];
       for(int i = 0; i < n; i++)
       {
           nums[i] = s1.nextInt();
       }
        
        //int nums[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
        int i,  nums_size = n;
        int left = 0, right = n - 1;
        
        System.out.println(Arrays.toString(nums));  
 
        while (left < right) 
        {
            /* While  0 at left increment left index  */
            while (nums[left] == 0 && left < right)
               left++;
 
            /* While we see 1 at right decrement right index*/
            while (nums[right] == 1 && left < right)
                right--;
 
           
            if (left < right) 
            {
                nums[left] = 0;
                nums[right] = 1;
                left++;
                right--;
            }
        }
        
       System.out.println(Arrays.toString(nums));  
    }
}
