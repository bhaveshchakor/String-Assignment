package week_7_String;

public class MytoLowerCase_Method
{
	public static void main(String[] args)
	{
		String s1 = "HefShine";
		String s2 = "HefshinEPunE";

		s1 = s1.toLowerCase(); //built-in method to convert string into lower-case
		System.out.println(s1);

		s2 = MyLowerCase(s2); //derived method to convert string into lower-case
		System.out.println(s2);
	}

	private static String MyLowerCase(String s2)
	{
		String s="";
		for (int i = 0; i <s2.length(); i++)
		
		{
			char ch= s2.charAt(i);
			if (ch>='A' && ch<='Z')
			ch=(char)(ch+32);
			s=s+ch;
		}
		
		return s;
	}
}
