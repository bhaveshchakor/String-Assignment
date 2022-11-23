package week_7_String;

public class MySplitMethod_AP
{
	public static void main(String[] args)
	{
		String s1="You All Are Very Good Students";
		String[]s2=mysplit(s1,' ');
		for (String ele : s2)
		{
			System.out.print(ele+" ");
		}
	}

	private static String[] mysplit(String s1, char ch)
	{
		int cnt=0;
		for (int i = 0; i < s1.length(); i++)
		{
			if (s1.charAt(i)==ch)
			{
				cnt++;
			}
		}
		String [] sa=new String[cnt+1];
		String s2="";
		int index=0;
		for (int i = 0; i < s1.length(); i++)
		{
			if (s1.charAt(i)!=ch)
			{
				s2=s2+s1.charAt(i);
			}
			else 
			{
				sa[index++]=s2;
				s2="";
			}
			if (i==s1.length()-1)
			{
				sa[index]=s2;
			}
		}
		return sa;
	}
}
