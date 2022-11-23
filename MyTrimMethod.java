package week_7_String;

public class MyTrimMethod
{

	public static void main(String[] args)
	{
		String s = "  kiran  kumar  ";
		System.out.println(s);//  kiran  kumar
		// s=s.trim();
		//System.out.println(s);//kiran  kumar. middle spaces will be ignored

		int start = 0;
		int end = s.length() - 1;
		while (true)
		{
			if (s.charAt(start) == ' ')
			{
				start++;
			}
			else if (s.charAt(end) == ' ')
			{
				end--;
			}
			else
			{
				break;
			}
		}
		
		String temp="";
		for (int i = start; i <= end; i++)
		{
			temp+=s.charAt(i);
		}
		
		System.out.println(temp);
		//kiran  kumar

	}

}
