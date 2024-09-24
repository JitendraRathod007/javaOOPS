class Demo
{
	int m1(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		return ;
	}
}
class WAWR
{
	public static void main(String args[])
	{
		Demo d1=new Demo();
		System.out.println(d1.m1(10,20));
	}
}