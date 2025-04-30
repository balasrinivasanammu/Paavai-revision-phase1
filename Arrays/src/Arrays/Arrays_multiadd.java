package Arrays;

class Arrays_multiadd{  
public static void main(String args[]){  
//creating two matrices  
int CSE[][]={{1,2},{3,4}};  
int IT[][]={{5,6},{7,8}};   
//creating another matrix to store the sum of two matrices  
int college[][]=new int[2][2];   
//adding and printing addition of 2 matrices  
for(int i=0;i<2;i++)
{  
	
for(int j=0;j<2;j++)
{  
college[i][j]=CSE[i][j]+IT[i][j];  
System.out.print(college[i][j]+" ");  
}  
System.out.println();//new line  
}   
}
} 
