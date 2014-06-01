
public class WildCardMatching {
	
	public static boolean matchPattern(String s1, String s2)
	{
		if(s1.length()==0 && s2.length()==0)
			return true;
		
		if((s1.length()==0 && s2.length() !=0) || (s2.length()==0 && s1.length() !=0) )
			return false;
		
		if(s1.charAt(0)=='?' || s1.charAt(0)== s2.charAt(0))
			return matchPattern(s1.substring(1,s1.length()), s2.substring(1,s2.length()));
		
		if(s1.charAt(0)=='*')
		{
			return (matchPattern(s1.substring(1,s1.length()), s2)|| matchPattern(s1, s2.substring(1,s2.length())));
		}
		return false;
	}
	
public static void main(String[] args) {
		
		String s1="ab?c*d";
		String s2="abzcpqqrrttd";
		
		System.out.println("Pattern Matches: "+matchPattern(s1, s2));
		
		
	}

}
