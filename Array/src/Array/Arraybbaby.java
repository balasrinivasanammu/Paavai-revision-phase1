package Array;
import java.util.*;
public class Arraybbaby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]= {10,20,30,40,50};
		Scanner s=new Scanner(System.in);
		int len=s.nextInt();
		int a[]=new int[len];
		for(int i=0;i<len;i++)
		{
			a[i]=s.nextInt();
			
		}
		for(int i=0;i<len;i++)
		{
			System.out.println(a[i]);
			
		}

	}

}
