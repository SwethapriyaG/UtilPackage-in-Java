//program to demonstrate StringTokenizer class
import java.util.*;

class StringTokenizerEx
{
	public static void main(String ar[])
	{
		String s = "Hello world, Welcome to Java";
		
		//Dividing the string based on space
		/*StringTokenizer st = new StringTokenizer(s);
		
		System.out.println("no of tokens : " +st.countTokens());
		
		while (st.hasMoreElements())
			System.out.println(st.nextElement()+ "@");
		*/
		
		
		//Dividing the string based on ","
		
		StringTokenizer st = new StringTokenizer(s, ",");
		
		System.out.println("no of tokens : " +st.countTokens());
		
		while (st.hasMoreTokens())
			System.out.println(st.nextToken()+ "@");
		
		
	}
}	