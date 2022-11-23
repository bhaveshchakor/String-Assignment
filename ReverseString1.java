package week_7_String;

import java.util.Arrays;

public class ReverseString1
{
	public static void main(String[] args)
	{
		String s = "You all are very very very good students";
		String[] sa = s.split(" ");

		int i = 0;
		int j = sa.length - 1;
		while (i < j)
		{
			String temp = sa[i];
			sa[i] = sa[j];
			sa[j] = temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(sa));
		// [students, good, very, very, very, are, all, You]
		
		String s2="";
		for (int j2 = 0; j2 < sa.length; j2++)
		{
			if (j2<sa.length-1)
			{
				s2=s2+sa[j2]+" ";
			} else
			{
				s2=s2+sa[j2];
			}
		}
		System.out.println(s2);
		// students good very very very are all You
	}
}
