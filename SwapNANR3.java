// program swapping number with No Argument with No return type


class Demo
{
	int a,b,temp;

	void m1()
   {
		temp=a;
		a=b;
		b=temp;
		System.out.println("value of A is:"+a);
		System.out.println("value of B is:"+b);
	}
}
class SwapNANR3
{
	public static void main(String args[])
	{
		Demo d1=new Demo();
		d1.a=50;
		d1.b=20;
		d1.m1();
	}
}
