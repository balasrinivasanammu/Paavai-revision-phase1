package Arrays;

public class Arraystudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int apple[][] = {
        		{1,2,3},
        		{4,5,6},
        		{7,8,9}
        };
        
        int banana[][] = {
        		{3,6,9},
        		{1,2,3},
        		{2,4,6}
        };
        int i,j;
        int pineapple[][]=new int[3][3];
        for(i=0;i<apple.length;i++) 
        {
        	for(j=0;j<banana.length;j++)
        	{
        		pineapple[i][j]=apple[i][j] + banana[i][j];
        		System.out.print(pineapple[i][j]+" ");
        	}
        	System.out.println();
        }
        				
        

	}

}
