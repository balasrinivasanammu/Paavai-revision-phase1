package Array;

/* 
Topic : Student marks- average
Get the no of subjects(Single student) from the class staff whereas 
get the all subjects marks for particular single student from the 
class staff. Then admin have to upload them marks on college portal
 * Use the scanner class for getting the input from the user.

Input format:
First line input - Enter the size of an array( No of subjects)
Second line inputs - Enter the number of elements line separated( score on subjects)

Sample Input:
10

10
20
30
40
50
60
70
80
90
100

Sample Output:
550
55.0

Input 1:
5
100
200
300
400
500

Output 1:
1500
300.0

Input 2:
2
90
40

Output 2:
130
65.0

Input 3:
3
10
20
30

Output 3:
60
20.0

Input 4:
8
20
30
50
40
60
80
90
40

Output 4:
410
51.25

Input 5:
1
200
200

Output 5:
200.0
 */


















/*import java.util.Scanner;
class Array_average {
	 public static void main(String[] args) {
	 int sum = 0;
	 Scanner input_size = new Scanner(System.in);
     int size = input_size.nextInt();
     int[] numbers = new int[size]; 
     Scanner sc = new Scanner(System.in);
     for (int i = 0; i < size; i++) {
    	 numbers[i] = sc.nextInt();
     }

	   for (int number: numbers) {
	     sum += number;
	   }
	   System.out.println(sum);
	 }
	}*/
import java.util.Scanner;
class Array_average {
	 public static void main(String[] args) {
	// int sum = 0;
	 Scanner input_size = new Scanner(System.in);
    int input1 = input_size.nextInt();
    int input2 = input_size.nextInt();
    int input3 = input_size.nextInt();
    int firstans=input2-input1;
    int secans=firstans*input3;
    int finalans=secans-1;
    System.out.println(finalans);
    
	 }
	}
