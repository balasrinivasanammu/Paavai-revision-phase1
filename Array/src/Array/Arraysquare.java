package Array;
import java.util.*;
public class Arraysquare {

	public static void main(String[] args) {
		int square=0;
		Scanner trisha=new Scanner(System.in);
		System.out.println("Enter the length of an leony");
		int leony=trisha.nextInt();
		int baby[]=new int[leony];
		System.out.println("Enter the elements");
		for(int i=0;i<leony;i++)
		{
			baby[i]=trisha.nextInt();
		}
		System.out.println("Your Output:");
		for(int i=0;i<leony;i++)
		{
			square=baby[i]*baby[i]*baby[i];
			System.out.println(square);
		}
	}

}
