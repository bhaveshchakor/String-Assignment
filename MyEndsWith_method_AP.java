package week_7_String;

public class MyEndsWith_method_AP
{
	public static void main(String[] args)
	{
		String s1 = "abcdxyz";
		String s2 = "xyz";
		
		boolean result1 = s1.endsWith(s2);
		System.out.println("java endwith ans: "+result1);

		boolean result2 = MyEndsWithMethod(s1, s2);
		System.out.println("My endswith ans: "+result2);

	}

	private static boolean MyEndsWithMethod(String s1, String s2)
	{
		if (s2.length() > s1.length())
		{
			return false;
		}
		int i=s1.length()-1;
		int j=s2.length()-1;
		while (j>=0)
		{
			if (s1.charAt(i)!=s2.charAt(j))
			{
				return false;
			}
			i--;
			j--;
		}
		return true;
	}
}
