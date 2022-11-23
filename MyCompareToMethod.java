package week_7_String;

public class MyCompareToMethod
{
	public static void main(String[] args)
	{
		String s1 = "abcd";
		String s2 = "abcdefg";

		int num1 = s1.compareTo(s2); // built-in method to compare two strings
		System.out.println(num1); //-3

		int num2 = MyCompare(s1, s2);// derived logic to compare two methods
		System.out.println(num2);//-3s
	}

	private static int MyCompare(String s1, String s2)
	{
		for (int i = 0; i < s1.length() && i < s2.length(); i++)

			if (s1.charAt(i) != s2.charAt(i))
			{
				return s1.charAt(i) - s2.charAt(i);
			}
		return s1.length() - s2.length();
	}
}
