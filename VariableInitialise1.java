class Demo
{

    int a,b;
	void m1()
	{
		System.out.println(a+b);
	}

}
class VariableInitialise1
{
	public static void main(String args[])
	{
		Demo d1=new Demo();
		d1.a=10;
		d1.b=20;
		d1.m1();
	}
}