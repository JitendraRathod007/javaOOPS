class GrandFather
{
	double grand(double n)
	{
		System.out.println("my age 30 year greater");
		return n+30;
	}
}
class Father extends GrandFather
{
	double fath(double n)
	{
		System.out.println("my age 20 year greater");
		return n+20;
	}
}
class child extends Father
{
	double chil(double n)
	{
		System.out.println(n+" is my age");
		return n;
	}
	public static void main(String args[])
	{
		Child sb=new Child();
		System.out.println(sb.chil(22));
	}
}

