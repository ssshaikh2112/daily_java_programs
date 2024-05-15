class Example6
{
	public static void main(String[] args)
	{
		Float aa=(100f);
		Integer bb=(200);
		System.out.println(aa);
		System.out.println(bb);
		int i=aa.intValue();
		int ii=bb.intValue();
		System.out.println(i);
		System.out.println(ii);

		
		//System.out.println(ii.toString());	//CE but not occur
	}
}
/*
	xxxxxvalue()	---> fiveX
	xxxxx	---> byte , short , int , double , float

	These method is rrsponsible to convert a Wrapper object to primitive data

	intValue() ---> int type(Primitive data)
*/