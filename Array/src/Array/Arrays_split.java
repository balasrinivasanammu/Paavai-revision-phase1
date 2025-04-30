package Array;
/*


Topic : Split patients to doctors
In rural area there is one hospital. N number of patients are coming daily. Only one doctors are there treat the entire patients. Due to covid-19, coming of patients count increased day by day. In this case hospital dean have to be decided to recruit one new doctor. According to the patient issues dean will be allocated the doctors whereas split the patients.
 
Use the scanner class for getting the input from the user whereas creating the matrix.
 
Input constraint:
1<=N<=10^n

Input Format

The first input contains an integer, -Enter no. of elements you want in array
The second input contains  space-separated integers- Enter the elements
The 3rd input contains an integer -Enter the position from where you want to split

Sample Input:
7
1 2 3 4 5 6 7
4

Sample Output:
1 2 3 4
5 6 7


Input 1:
5
6 7 8 9 -10
2

Output 1:
6 7 
8 9 -10 

Input 2:
10
1000 2000 3000 4000 5000 6000 7000 8000 9000 1000
7

Output 2:
1000 2000 3000 4000 5000 6000 7000 
8000 9000 1000

Input 3:
2
-1000 -2000
1

Output 3:
-1000 
-2000 

Input 4:
1
1000
1
Output 4:
1000 

Input 5:
3
-8 -7 -6
1

Output 5:
-8 
-7 -6 
 */
import java.util.Scanner;
public class Arrays_split
{
    public static void main(String[] args) 
    {
        int n, x, flag = 1, loc = 0, k = 0,j = 0;
        Scanner s = new Scanner(System.in);
        //System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        //System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        //System.out.print("Enter the position from where you want to split:");
        loc = s.nextInt();
        for(int i = 0; i < loc; i++)
        {
            b[k] = a[i];
            k++;
        }
        for(int i = loc; i < n; i++)
        {
            c[j] = a[i];
            j++;
        }
        //System.out.print("First array:");
        for(int i = 0;i < k; i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println("");
        //System.out.print("Second array:");
        for(int i = 0; i < j; i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}
