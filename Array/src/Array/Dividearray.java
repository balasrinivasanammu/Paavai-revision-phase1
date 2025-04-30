package Array;

public class Dividearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age[]= {100,80,71,53,61,25,32,40,90};
		int res=0;
		for(int i=0;i<age.length;i++)
		{
			if(age[i]%10==1)
			{
				res=res+1;
				System.out.println(age[i]);
			}
		}
		System.out.println(res);

	}

}
