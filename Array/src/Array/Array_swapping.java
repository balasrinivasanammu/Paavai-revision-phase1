package Array;

/* Topic - Train seats(Swaps)

Question Text:
5 members are planning to go to vaccation on summer season. So they reserved the train tickets for vaccation. During the journey time on train other 5 peoples occupied them reserved tickets. They convey the issues to TTR. He saying dont be occupied them 5 seats. so you all pleased to take your seats in-front of them opposite without changing your order. 
Use the scanner class for getting the input from the user.

Input constraint:
1<=N<=10^n

Input format:

Input 1 : First line is consider as the size of an array
Notes: 2nd and 3rd lines considered as the array of elements
Input 2 : Give an integer array from command line. 
Input 3 : Give an another integer array from command line. 

Output : array1 : {5,6,0,8,4,3} and array2 : {1,2,4,5,3,7}

Sample Input:
5
1 2 3 4 5
6 7 8 9 10

Sample Output:
6 7 8 9 10 
1 2 3 4 5 
 */

/*Input 1:
3
10 20 30
40 50 60

Output 1:
40 50 60 
10 20 30 

Input 2:
7
50 60 70 -80 90 100 80
-1 -2 -3 50 60 70 80

Output 2:
-1 -2 -3 50 60 70 80 
50 60 70 -80 90 100 80 

Input 3:
4
-1 -2 -3 -4
-5 -6 -7 -8

Output 3:
-5 -6 -7 -8 
-1 -2 -3 -4 

Input 4:
2
100 200
300 400

Output 4:
300 400 
100 200

Input 5:
1
1
8
Output 5:
8 
1 
*/
	
import java.util.Scanner;

public class Array_swapping {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of Arrays : ");
        int size = s.nextInt();
        int[] array1 = new int[size], array2 = new int[size], buffer = new int[size];
        
        System.out.println("Enter the First Array of Elements: ");
        for (int i = 0; i < size; i++) {
            array1[i] = s.nextInt();
        }
        System.out.println("Enter the Second Array of Elements: ");
        for (int i = 0; i < size; i++) {
            array2[i] = s.nextInt();
        }
     
        for (int i = 0; i < size; i++) {
            buffer[i] = array1[i];
            array1[i] = array2[i];
            array2[i] = buffer[i];
        }
        
        System.out.println("First Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array1[i]+ " ");
        }
        System.out.println();
        System.out.println("Second Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array2[i]+" ");
        }
    }
}

