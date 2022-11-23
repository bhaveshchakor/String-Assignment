package week_7_String;

// Assignment no 12
public class StartsWith_Method
{
	public static void main(String[] args)
	{
		String s1 = "kiran";
		String s2 = "ki";

		System.out.println("Java ans: " + s1.startsWith(s2)); // it is case sensitive
		// true

		boolean Myans=MyStartsWith(s1, s2);
		System.out.println("My ans: "+Myans);
		//true
	}

	private static boolean MyStartsWith(String s1, String s2)
	{
		if (s2.length() <= s1.length())
		{
			int counter = 0;
			for (int i = 0; i < s2.length(); i++)
			{
				if (s1.charAt(i) != s2.charAt(i))
				{
					counter++;
				}
			}
			if (counter == s2.length())
			{
				return true;
			} 
			else
			{
				return false;
			}
		} 
		else
		{
			return false;
		}

	}
}
