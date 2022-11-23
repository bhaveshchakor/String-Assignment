package week_7_String;

public class MyLowerCase_AC
{
public static void main(String[] args)
{
	String s="abhGGSkj";
	String lower=s.toLowerCase();
	System.out.println("Java ans : "+lower);
	
	String lower2=myLower(s);
	System.out.println("my method :"+lower2);
}

private static String myLower(String s)
{
	String s1="";
	
	for (int i = 0; i < s.length(); i++)
	{
		if (s.charAt(i)>='A' && s.charAt(i)<='Z')
		{
			char ch=(char)(s.charAt(i)+32);
			s1=s1+ch;
		} else
		{
			s1=s1+s.charAt(i);
		}
	}
	return s1;
}
}
/*
Java ans : abhggskj
my method :abhggskj
*/