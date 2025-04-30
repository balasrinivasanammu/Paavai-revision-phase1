package Arrays;


public class Array_diagnol {
static int horizontal1=0,horizontal0=0,vertical1=0,vertical0=0;
public static void main(String[] args) {
int[][] arr= {
{0,0,1},
{0,0,0},
{0,0,0}
};
int diagr1=0,diagl1=0,diagr0=0,diagl0=0;
int k=arr.length-1;
int d1=0,d2=0,d10=0,d20=0;
for(int i=0;i<arr.length;i++) {
int h1=0,v1=0,h0=0,v0=0;
for(int j=0;j<arr[i].length;j++) {
if(i==j && arr[i][j]==1)d1++;
else if(i==j && arr[i][j]==0)d10++;
if(j==k && arr[i][k]==1)d2++;
else if(j==k && arr[i][k]==0)d20++;

if(arr[i][j]==1)v1++;
else v0++;

if(arr[j][i]==1)h1++;
else h0++;

}
if(v1==arr[i].length) vertical1++;
if(v0==arr[i].length) vertical0++;
if(h1==arr.length) horizontal1++;
if(h0==arr.length) horizontal0++;
k--;
}
diagr1=(d2==arr.length)?diagr1+1:diagr1;
diagl0=(d10==arr.length)?diagl0+1:diagl0;
diagr0=(d20==arr.length)?diagr0+1:diagr0;
diagl1=(d1==arr.length)?diagl1+1:diagl1;

System.out.println("1 diagnol is "+(diagl1+diagr1)+"\n1 vertical is "+vertical1+"\n1 horizontal is "+horizontal1);
System.out.println("0 diagnol is "+(diagl0+diagr0)+"\n0 vertical is "+vertical0+"\n0 horizontal is "+horizontal0);

}

}
