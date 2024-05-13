import java.util.StringTokenizer;

class Example27
{
	public static void main(String[] args)
	{
		StringTokenizer st= new StringTokenizer("sahil shaikh is the computer engineering student");
		while (st.hasMoreTokens())	//	checks element is present or not
		{
			System.out.println(st.nextToken());		//extract the element	
		}
		
	}
}
// public boolean hasMoreElements()
// public Object nextElement()
