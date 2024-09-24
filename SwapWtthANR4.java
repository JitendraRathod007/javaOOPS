class Demo
{
	int temp;

	void m1(int a,int b)
	{
		temp=a;
		a=b;
		b=temp;

		System.out.println(a);
		System.out.println(b);
	}
}
class SwapWithANR4
{

	public static void main(String args[])
	{
	    Demo d1=new Demo();
		d1.m1(10,20);

	}
}