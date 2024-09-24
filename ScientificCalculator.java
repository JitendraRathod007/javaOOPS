class Calculator
{
	double add(double a,double b)
	{
		return a+b;
	}
    double sub(double a,double b)
    {
		return a-b;
	}
	double mul(double a,double b)
	{
		return a*b;
	}
}
	class ScientificCalculator extends Calculator
	{
		double square(double n)
		{
			return n*n;
		}
		double cube(double n)
		{
			return n*n*n;
		}
		public static void main(String args[])
		{
			ScientificCalculator sb=new ScientificCalculator();
			System.out.println(sb.add(5,8));
			System.out.println(sb.mul(10,9));
			System.out.println(sb.add(2,3));
			System.out.println(sb.cube(5));
		}
	}