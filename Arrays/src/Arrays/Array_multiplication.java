package Arrays;
class Array_multiplication
{  
public static void main(String args[])
{  
//creating two matrices  
int CSE[][]={{10,20},{40,50}};  
int IT[][]={{1,3},{3,4}};   
//creating another matrix to store the sum of two matrices  
int college[][]=new int[2][2];  
//adding and printing addition of 2 matrices  
for(int i=0;i<2;i++)
{  
for(int j=0;j<2;j++)
{  
college[i][j]=0; 
for(int k=0;k<2;k++) 
{
college[i][j]=college[i][j]+CSE[i][k]*IT[k][j];  
}
System.out.print(college[i][j]+" ");  
}  
System.out.println();//new line  
}  
  
}} 

