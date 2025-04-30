package Array;

/*Topic:Number of FIR case
/*
 * 
Checks whether the bike number is how many times crossed the toll plaza on covid-19 period.
Enter size of array and then enter all the elements of that array. Find the no of occurrences.
Use the scanner class for getting the input from the user.

Input Format:
The first input contains an integer-Enter no. of elements you want in array
The second input contains space-separated integers- Enter the array elements
The 3rd input contains-Enter the element of which you want to count number of occurrences


Sample Input:
5

10 20 30 20 10
10

Sample Output:
2

Input 1:
5
6 7 8 9 6
6

Output 1:
2

Input 2:
2
2 2
2

Output 2:
2


Input 3:
1
10
10

Output 3:
1

Input 4:
6
50 60 1478 1458 7892 60
50

Output 4:
1

Input 5:
5
10 20 30 40 50
100

Output 5:
0

 */

import java.util.Scanner;
public class Array_noofoccurance
{
    public static void main(String[] args) 
    {
        int n,  count = 0, i = 0;
        char x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        char a[] = new char[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
             a[i] = s.next().charAt(0);
        }
        System.out.print("Enter the element of which you want to count number of occurrences:");
        x = s.next().charAt(0);
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}