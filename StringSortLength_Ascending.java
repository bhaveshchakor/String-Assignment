package week_7_String;

public class StringSortLength_Ascending
{
	public static void main(String[] args)
	{
		String s = "welcome to java programming";
		String[] s1 = s.split(" ");
		
		for (int i = 0; i < s1.length; i++)
		{
			for (int j = i+1; j < s1.length; j++)
			{
				if (s1[i].length()>s1[j].length())
				{
					String temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
				}
			}
		}
		for (String string : s1)
		{
			System.out.println(string);
		}
	}
}
/*
to
java
welcome
programming
*/