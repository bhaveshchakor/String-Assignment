package week_7_String;

public class SplitLogic
{
	public static void main(String[] args)
	{
		String s1 = "Kiran Kumar yuva Nete";
		char ch = ' ';
		int cnt = 0;
		for (int i = 0; i < s1.length(); i++)
		{
			if (s1.charAt(i) == ch)
			{
				cnt++;
			}
		}
		String[] sa = new String[cnt + 1];
		String temp = "";

		int index = 0;
		for (int i = 0; i < s1.length(); i++)
		{
			if (s1.charAt(i) != ch)
			{
				temp += s1.charAt(i);
			}
			else
			{
				sa[index++] = temp;
				temp = "";
			}
			if (i == s1.length()-1)
			{
				sa[index++] = temp;
			}
		}

		for (String ele : sa)
		{

			System.out.print(ele + " ");

		}
	}
}
