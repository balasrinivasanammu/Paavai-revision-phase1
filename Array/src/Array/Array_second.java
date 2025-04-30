package Array;

import java.util.Scanner;
import java.util.Arrays;

public class Array_second {

	public static void main(String[] balaji) {
		// TODO Auto-generated method stub
		 
		Scanner input_size = new Scanner(System.in);
	     int sum=0;
		 int size = input_size.nextInt();
	     int[] numbers = new int[size];
	     
	     for (int i = 0; i < size; i++) 
	     {
	    	 numbers[i] = input_size.nextInt();
	    	 sum=sum+numbers[i];
	     }
	     System.out.println("sum="+sum);
	     System.out.println("Average="+(sum/numbers.length));

	}

}
