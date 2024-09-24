class FindLastDigit6
{
	int last(int n)
	{
		n=n%10;
		return n;
	}
	public static void main(String args[])
	{
		FindLastDigit6 d1=new FindLastDigit6();
		System.out.println(d1.last(542));
	}
}
