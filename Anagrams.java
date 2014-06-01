
public class Anagrams {
	
	public static void printAnagrams(String prefix, String suffix)
	{
		if(suffix.length()==0)
			System.out.println(prefix);
		else
			for(int i=0;i<suffix.length();i++)
			{
				printAnagrams(prefix+suffix.charAt(i),suffix.substring(0, i)+suffix.substring(i+1, suffix.length()));
			}
			
		
	}
	
	public static void main(String[] args) {
		
		String str = "abc";
		
		printAnagrams("", str);
		
	}

}
