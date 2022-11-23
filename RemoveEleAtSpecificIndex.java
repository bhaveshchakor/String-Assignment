package week_7_String;

public class RemoveEleAtSpecificIndex
{
	public static void main(String[] args)
	{
		String s1 = "abRatwadazpa";
		String s2 = "";
		char ch = 'a';
//Remove all

		/*
		 * for (int i = 0; i < s1.length(); i++) { if (s1.charAt(i) == ch) { continue; }
		 * else { s2 += s1.charAt(i); } } System.out.println(s2);
		 */

//Remove 0th index a

		/*
		 * int cnt = 0; for (int i = 0; i < s1.length(); i++) { if (s1.charAt(i) == ch
		 * && cnt < 1) { cnt++; continue; } else { s2 += s1.charAt(i); } }
		 * System.out.println(s2);
		 */

//Remove at specific index

	/*	int num = 2;
		for (int i = 0; i < s1.length(); i++)
		{
			if (i != num)
			{
				s2 += s1.charAt(i);
			}
			else
			{
				continue;
			}
		}
		System.out.println(s2);*/

//remove 2nd a
		int num = 2;
		int cnt = 0;
		for (int i = 0; i < s1.length(); i++)
		{
			if (s1.charAt(i) == ch)
			{
				cnt++;
				if (cnt != num)
				{
					s2 += s1.charAt(i);
				}
			}
			else
			{
				s2 += s1.charAt(i);
			}
		}
		System.out.println(s2);

	}
}
