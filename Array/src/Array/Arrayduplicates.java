package Array;
import java.util.*;
public class Arrayduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of an a array");
		int len=s.nextInt();
		float a[]=new float[len];
		System.out.println("Entre the elments");
		for(int i=0;i<len;i++)
		{
			a[i]=s.nextFloat();
		}
		System.out.println("Your duplicate elements");
		for(int j=0;j<len;j++)
		{
		for(int k=j+1;k<len;k++)
		{
			if(a[k]==a[j])
			{
				System.out.println(a[j]);
				//continue;			
			}
			
		}		
		}
	}
}

