package week_7_String;

public class ReverseString2
{
	public static void main(String[] args)
	{
		String s = "You all are very very very good students";
		String[] sa = s.split(" ");
		String newString = "";
		for (int i = 0; i < sa.length; i++)
		{
			String s1 = sa[i];
			char[] ca = s1.toCharArray();
			int j = 0;
			int k = ca.length - 1;
			while (j < k)
			{
				char ch = ca[j];
				ca[j] = ca[k];
				ca[k] = ch;
				j++;
				k--;
			}
			String s2 = new String(ca);

			newString += s2 + " ";

		}
		System.out.println(newString);
		// uoY lla era yrev yrev yrev doog stneduts
	}
}
