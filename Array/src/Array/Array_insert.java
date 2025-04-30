package Array;
/*
 * 
 Topic : Recruit Employee ( Insert on certain position)
 To recruit the new employee on certain position at certain place. According to the HR instruction have to place our new employee on our office.
 
 Use the scanner class for getting the input from the user whereas creating the matrix.
 
Input constraint:
1<=N<=10^n

Input Format

The first input contains an integer, -Enter the no of elements or size of an array
The second input contains  space-separated integer- Enter the elements
The 3rd input contains an integer -Enter the position where you want to insert element
The 4th input contains an integer - Enter the element you want to insert
 * Sample Input:
2

10
20

Sample Output:
1
100
100,10,20

Input 1:

3
10 80 30
2
1000

Output 1:

10,1000,80,30

Input 2:

4
1000 2000 3000 4000
3
7000

OUtput 2:
1000,2000,7000,3000,4000

Input 3:
6
100 200 -300 -400 -500 -600
1
-5000

Output 3:
-5000,100,200,-300,-400,-500,-600

 */

import java.util.Scanner;
public class Array_insert 
{
    public static void main(String[] args) 
    {
        int n, pos, x;
        Scanner s = new Scanner(System.in);
        //System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n+1];
        //System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        //System.out.print("Enter the position where you want to insert element:");
        pos = s.nextInt();
        //System.out.print("Enter the element you want to insert:");
        x = s.nextInt();
        for(int i = (n-1); i >= (pos-1); i--)
        {
            a[i+1] = a[i];
        }
        a[pos-1] = x;
        //System.out.print("After inserting:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n]);
    }
}
