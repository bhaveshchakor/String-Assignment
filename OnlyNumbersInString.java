package week_7_String;

public class OnlyNumbersInString
{
	public static void main(String[] args)
	{
		String s="12-3481";
		int counter=0;
		for (int i = 0; i< s.length(); i++)
		{
			if (s.charAt(i)>='0' && s.charAt(i)<='9' || s.charAt(i)<'0')
			{
				counter++;
			}
		}
		if (counter==s.length())
		{
			System.out.println("string contains only numbers");
		}
		else {
			System.out.println("Not only Numbers.");
		}
	}
}
