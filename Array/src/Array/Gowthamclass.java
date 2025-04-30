package Array;

class trainer {
int eid=20;
String ename="Gowtham";
int a=20,b=5;
int result=0;
void add()
{
	
	System.out.println(result=a+b);
}
void sub()
{
	System.out.println(result=a-b);
}
void mul()
{
	System.out.println(result=a*b);
}
void div()
{
	System.out.println(result=a/b);
}
}
public class Gowthamclass
{
	public static void main(String args[])
	{
		trainer t=new trainer();// create the object or instance
		System.out.println(t.eid);
		System.out.println(t.ename);
		t.add();
		t.sub();
		t.mul();
		t.div();
		trainer t1=new trainer();
		t1.add();
		}
}
