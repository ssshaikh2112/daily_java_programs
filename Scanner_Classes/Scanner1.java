import java.util.Scanner;

class Scanner1
{
	public static void main(String[] args)
	{
		String str= "My name is Sahil and I'm student of Computer engineering";
		Scanner sc= new Scanner(str);

//the scanner class break information in the form of tokens and once 
//token into Scanner we have to check token is present or not if present 
//then we need to extract it. For these we use method hasNext()

		while (sc.hasNext())				
		{
			System.out.println(sc.next());	// for extract token use method next()
		}
	}
}