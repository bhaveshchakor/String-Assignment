package week_7_String;

public class MaxSubstring
{
	public static void main(String[] args)
	{
		String s = "abcdabcdefahb";
		String maxString = "";

		for (int i = 0; i < s.length(); i++)
		{
			for (int j = i + 1; j <= s.length(); j++)
			{
				String str = Mysubstring(s, i, j);
				if (Nonrepeatingchar(str))
				{
					if (str.length() > maxString.length())
					{
						maxString = str;
					}
				}
				else
				{
					break;
				}
			}
		}
		System.out.println(maxString + " " + maxString.length());
	}
	private static boolean Nonrepeatingchar(String str)
	{
		for (int i = 0; i < str.length(); i++)
		{
			for (int j = i + 1; j < str.length(); j++)
			{
				if (str.charAt(i) == str.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
	}
	private static String Mysubstring(String s, int i, int j)
	{
		String str = "";
		for (int k = i; k < j; k++)
		{
			str += s.charAt(k);
		}
		return str;
	}
}
