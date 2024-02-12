class SwitchMatchesUnicodeV
{
	public static void main(String args[])
	{
		int a =97;
		
		switch(a)
		{
			case 10:
				System.out.println("Inside case 1 ");
				break;

			case 'a':
				System.out.println("It checks the unicode value of a = 97 and print these case...");
				break;

			case 'b':
				System.out.println("It check the unicode value also...");
				break;
			default:
				System.out.println("Print default statement if none of case match");
				break;
		}
	}

}