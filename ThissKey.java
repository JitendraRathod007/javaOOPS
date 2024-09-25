class ThisKK
{
	int i;
	void setValue(int i)
	{
		this.i=i;
		System.out.println("call setValue method: "+i);
	}
	void show()
	{
		System.out.println(i);
	}
}
class ThissKey
{
	public static void main(String args[])
	{
		ThisKK k=new ThisKK();
		k.setValue(10);
		k.show();
	}
}