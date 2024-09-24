class Upcasting0
{
	void m1()
	{
		System.out.println("m1 method of upcasting");
	}
	void m2()
	{
		System.out.println("m2 method of upcasting");
	}
	void m3()
	{
		System.out.println("m3 method of upcasting");
	}
}

	class Upcasting1 extends Upcasting0
	{
			void m4()
			{
				System.out.println("m4 method of upcasting1");
			}
			void m5()
			{
				System.out.println("m5 method of upcasting1");
			}
			void m6()
			{
				System.out.println("m6 method of upcasting1");
	         }
	 }

	          class Upcasting2 extends Upcasting1
	          {
	                	void m7()
			 			{
			 				System.out.println("m7 method of upcasting1");
			 			}
			 			void m8()
			 			{
			 				System.out.println("m8 method of upcasting1");
			 			}
			 			void m9()
			 			{
			 				System.out.println("m9 method of upcasting1");
	                    }
					}

					class Upcasting
					{
						public static void main(String args[])
						{
							Upcasting1 u1=new Upcasting2();

						}
					}