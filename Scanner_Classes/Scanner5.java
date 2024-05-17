import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
class Scanner5
{
	public static void main(String[] args) throws FileNotFoundException
	{
		FileReader ff=new FileReader("D:\\Programming\\cybersuccess\\ScannerClass\\Scanner2TextFile.txt");		// read the content from file
		Scanner scan= new Scanner(ff);
		scan.useDelimiter(",");			// user define delimiter
		while (scan.hasNext())
		{
			System.out.println(" "+scan.next());
		}
	}
}
// public java.io.File(java.lang.String);
//  public java.util.Scanner(java.io.File) throws java.io.FileNotFoundException