import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;

class FileReadWrite
{
	public static void main(String[] args) throws FileNotFoundException , IOException
	{
		// source.txt --> Program --> Destination.txt

		FileReader fr = new FileReader("D:\\Programming\\cybersuccess\\IOPackages\\Source2.txt");	// object
		FileWriter fw = new FileWriter("D:\\Programming\\cybersuccess\\IOPackages\\Destination2.txt");
		int info;											// // read() return int so use the int info variable.

		while ((info=fr.read())!=-1)						//					
		{
			System.out.print((char)info);
			fw.write(info);
		}
		fr.close();							// close objects because unneccessory memory is created.
		fw.close();							// close objects because unneccessory memory is created.

	}
}

//public FileReader(String fileName) throws FileNotFoundException
// public int read() throws IOException
// public int write() throws IOException

/*
	(2)	characterOrientedStream Channel
	
	In characterOrientedStream Channel java supports two class

	i) readerclass
	ii) writerclass

	Reader and Writer class are by nature abstract so we can not create an object of that so 
	we prefered to child class.
	ie. FileReader and FileWriter
*/