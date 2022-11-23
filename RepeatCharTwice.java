package week_7_String;

public class RepeatCharTwice
{
	public static void main(String[] args)
	{
		String s="abc";
		String s1="";
		for (int i = 0; i < s.length(); i++)
		{
			char ch=s.charAt(i);
			s1=s1+ch+ch;
		}
		System.out.println(s1);
	}
}
/*
aabbcc
*/