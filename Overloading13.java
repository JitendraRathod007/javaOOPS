class Overloading13
{
	void display(char a,char b)
	{
		System.out.println("char parameter method will passed");
	}
	void display(int a,int b)
	{
		System.out.println("int parameter will passed");
	}
	void display(double a,double b)
	{
		System.out.println("this Method  can access all parametre");
	}
	public static void main(String args[])
	{
		Overloading13 Ov=new Overloading13();
		Ov.display('a','b');
		Ov.display(12,23.2);
		Ov.display(12.3,'s');
		Ov.display(12,13);
	}
}