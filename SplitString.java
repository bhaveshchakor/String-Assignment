package week_7_String;

import java.util.Iterator;

public class SplitString
{
	public static void main(String[] args)
	{
		String s = "welcome to java programming";
		String[] sa = s.split(" ");

		for (int i = 0; i < sa.length; i++)
		{
			//System.out.println(sa[i]);
		}

		int[] a = {1,2,3,4,5 };
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]+""+a[i]);
		}
	}
}
