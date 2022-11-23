package week_8;

public class StringSortDictionary
{
	public static void main(String[] args)
	{
		String [] sa= {"bhavesh", "vikas","kiran","amol","chetan"};
		for (int i = 0; i < sa.length; i++)
		{
			for (int j = i+1; j < sa.length; j++)
			{
				if (MyCompare(sa[i],sa[j])>0)
				{
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
		
		for (int i = 0; i < sa.length; i++)
		{
			System.out.print(sa[i]+" "); // amol bhavesh chetan kiran vikas 
		}
	}

	private static int MyCompare(String s1, String s2)
	{
		
		for (int i = 0; i < s1.length() && i<s2.length(); i++)
		{
			if (s1.charAt(i)!=s2.charAt(i))
			{
				return s1.charAt(i)-s2.charAt(i);
			}
		}
		return s1.length()-s2.length();
	}
}
