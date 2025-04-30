package Array;
/*

Topic : Increase Salary to all employees
Certain people's are working on one MNC company. Company will be decided to give 1000 rupees along with them salaries on diwali festival.
 
Use the scanner class for getting the input from the user whereas creating the matrix.
 
Input constraint:
1<=N<=10^n

Input Format

The first input contains an integer, -Enter no. of elements you want in array
The second input contains  space-separated integers- Enter the elements

Output Format:
should all elements comes along with comma separated. 

 
Enter size of array and then enter all the elements of that array. Now using for loop we increment all the elements of the array.
To Increment Every Element of the Array by 1000 & Print Incremented Array.
Each and every array elements incremented by 1000.
Sample Input:

1
1000

Sample Output:
2000

Input 1:
5
100 200 300 400 500

Output 1:
1100,1200,1300,1400,1500

Input 2:
2
750 850000

Output 2:
1750,851000

Input 3:
3
-1000 -2000 -3000

Output 3:
0,-1000,-2000

Input 4:
5
-750 750 850 -850 -500
Output 4:
250,1750,1850,150,500
*/
import java.util.Scanner;
public class Arrays_incrementsalary
{
    public static void main(String[] args) 
    {
        int n, i = 0,total=0;
        float avg=0.0f;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            total=total+a[i];
        }
        System.out.print("Elements of array after increment by 1000:\n");
        for(i = 0; i <n; i++)
        {
            System.out.print(a[i]+",");
        }
        avg=total/n;
        System.out.println("Total="+total);
        System.out.println("Average="+avg);
    }
}
