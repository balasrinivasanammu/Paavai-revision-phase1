package Arrays;

public class Arrayreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] age = new int [] {2,4,6,8,5};

	        for (int i=0;i<age.length;i++) 
	        {
	        	int fact=1;
	        	for(int j=1;j<=age[i];j++)
	        	{
	        		fact=fact*j;
	        	}
	        	System.out.println(fact);	
	        }
	        
	        
	        
	}

}
