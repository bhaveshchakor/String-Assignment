package week_7_String;

public class GetCharAtIndex
{
public static void main(String[] args)
{
	String s= "Chetan";
	//one way
	char[]ch=s.toCharArray();
	for (int i = 0; i < ch.length; i++)
	{
		System.out.println(i+" "+ch[i]);
	}
	
	// 2nd way
	System.out.println();
	for (int i = 0; i < s.length(); i++)
	{
		System.out.println(+i+" "+s.charAt(i));
	}
}
}
