package week_7_String;

public class MyEndswith_Method
{

	public static void main(String[] args)
	{
		String s1 = "abcd";
		String s2 = "cd";

		System.out.println("Java ans: " + s1.endsWith(s2)); // it is case sensitive
		//Java ans: true

		boolean Myans= MyEndsWith(s1, s2);
		System.out.println("My ans: "+Myans);
		//My ans: true

	}

	private static boolean MyEndsWith(String s1, String s2)
	{
		if (s2.length() <= s1.length())
		{
			int s1Index = s1.length() - 1;
			int s2Index = s2.length() - 1;
			int counter = 0;
			for (int i = 0; i < s2.length(); i++)
			{
				if (s2.charAt(s2Index) == s1.charAt(s1Index))
				{
					counter++;
				}
				s1Index--;
				s2Index--;
			}
			if (counter==s2.length())
			{
				return true;
			} else
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
