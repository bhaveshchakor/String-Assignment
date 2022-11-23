package week_7_String;

public class ShortcutMethods
{
	public static void main(String[] args)
	{
		String s = "Welcome";

		System.out.println(s.length()); // 1. This is variables returns the length of string

		s = s.concat(" to java"); // 2. this adds the second string into 1st string
		System.out.println(s);

		s = s.toUpperCase(); // converts whole string into capital letters
		System.out.println(s);

		s = s.toLowerCase(); // converts whole string into small letters
		System.out.println(s);
		
		s=s.replace('a', '*');// replace particular word with given word in whole string
		System.out.println(s);
		
		System.out.println( s.contains("java"));//returns either true or false
		
		
		char[] ch = s.toCharArray(); // 3. This variable converts the string into array
		for (char ele : ch)
		{
			System.out.print(ele);
		}

	}
}
