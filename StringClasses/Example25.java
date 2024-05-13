class Example25
{
	public static void main(String[] args)
	{
		String str1="sahil shaikh is a Computer Engineering student";
		System.out.println(str1);
		String[] str2=str1.split(" ");	// it remove the blank spaces --> (" ")

		for (int i=0;i<str2.length ;i++ )
		{
			System.out.println(str2[i]);
		}

	}
}
//   public java.lang.String[] split(java.lang.String);