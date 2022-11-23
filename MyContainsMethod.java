package week_7_String;

public class MyContainsMethod
{
	public static void main(String[] args)
	{
		String s1 = "Hefshine";
		String s2 = "shine";
		boolean result = s1.contains(s2);
		System.out.println(result);

		boolean result2 = MyContains(s1, s2);
		System.out.println(result2);
	}

	private static boolean MyContains(String s1, String s2)
	{
		if (s2.length() > s1.length())
			return false;

		for (int i = 0; i < s1.length(); i++)
		{
			if (s1.charAt(i) == s2.charAt(0))
			{
				int k = i + 1;
				int j = 1;
				int counter = 1;
				while (j < s2.length() && k < s1.length())
				{
					if (s1.charAt(k) == s2.charAt(j))
					{
						counter++;
					} 
					else
					{
						break;
					}
					j++;
					k++;
				}
				if (counter == s2.length())
				{
					return true;
				}

			}
			
		}
		return false;

	}
}
