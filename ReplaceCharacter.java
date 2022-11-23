package week_7_String;

public class ReplaceCharacter
{
	public static void main(String[] args)
	{
		String s1 = "aBaHaAaVaEaSaHa";
		String s2 = "";
		char oldchar = 'a';
		char newchar = '*';
// method 1
		for (int i = 0; i < s1.length(); i++)
		{
			if (s1.charAt(i) == oldchar)
			{
				s2 = s2 + newchar;
			} else
			{
				s2 = s2 + s1.charAt(i);
			}
		}
		System.out.println("Using String Method: "+s2);
//method 2 using char array
		char[]ch=s1.toCharArray();
		String s3 = "";
		for (int i = 0; i < ch.length; i++)
		{
			if (ch[i]==oldchar)
			{
				s3=s3+newchar;
			}
			else
			{
				s3=s3+ch[i];
			}
		}
		System.out.println("Using Array Method: "+s3);
	}
}
