class Example6
{
	public static void main(String[] args)
	{
		String str1 = new String("Sahil");
		System.out.println(str1);
		str1 =str1.concat("Shaikh");
		System.out.println(str1);
	}
}

//Class does not allow its object data to be change such behavior is called Immutable
// String Class are "Immutable"
// public jaav.lang.String concat(java.lang.String);