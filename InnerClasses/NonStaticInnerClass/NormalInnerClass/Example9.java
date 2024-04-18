class OuterClassA
{
	void m1()
	{
		InnerClassB ref1=new InnerClassB();
		System.out.println(ref1.a+ref1.b);
	}
	class InnerClassB
	{
		private int a=10;
		private float b=11.5f;
		
	}
}


class Example9
{
	public static void main(String[] args)
	{
	
		OuterClassA ref2 = new OuterClassA();
		ref2.m1();
	}
}