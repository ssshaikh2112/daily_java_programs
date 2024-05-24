class Example13
{
	
	void method(String[] ss)	// ss -- we provides array of String ie. s
	{
		for(String s:ss)		// in s Store the value of ss
		{
			System.out.println(s);
		}
	}

	public static void main(String[] args)
	{
		Example13 ref1=new Example13();
		String[] s={"Sahil","Shaikh","Intern"};
		ref1.method(s);
	}
}