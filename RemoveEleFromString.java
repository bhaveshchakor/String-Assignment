package week_7_String;

public class RemoveEleFromString
{
	public static void main(String[] args)
	{
		String s1 = "Kira!n";
		String s2 = "";
		char ch = '!';

		for (int i = 0; i < s1.length(); i++)
		{
			if (s1.charAt(i) != ch)
			{
				s2 = s2 + s1.charAt(i);
			}
		}
		System.out.println(s2);
		// Kiran

	}
}
