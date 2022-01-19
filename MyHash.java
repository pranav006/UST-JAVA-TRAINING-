import java.util.HashSet;

public class MyHash {
	static boolean isStringUnique(String s1)
	{
		HashSet<Character> hs = new HashSet<Character>();
		
		for(int i=0; i<s1.length();i++)
		{
			char c = s1.charAt(i);
			if(c==' ')
				continue;
			if(hs.add(c)== false)
				return false;
		}
		
		return true;
	}
public static void main(String[] args)
{
	String str = "psk";
	
	boolean result = isStringUnique(str);
	
	if(result)
		System.out.println("Unique");
	else
		System.out.println("Not Unique");
}
}
