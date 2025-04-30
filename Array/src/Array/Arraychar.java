package Array;
import java.util.*;
public class Arraychar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char name[]= {'b','a','l','a','j','i'};
		for(int i=0;i<name.length;i++)
		{
			System.out.print(name[i]);
		}*/
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the len of array");
		int len=s.nextInt();
		char name[]=new char[len];
		System.out.println("Enter the char elements");
		for(int i=0;i<len;i++)
		{
			name[i]=s.next().charAt(0);
		}
		for(int j=0;j<len;j++)
		{
		for(int k=j+1;k<len;k++)
		{
			if(name[j]==name[k]) 
			{
			System.out.println(name[j]);	
			}
		}

	}
	}

}
