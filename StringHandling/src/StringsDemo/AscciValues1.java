package StringsDemo;

public class AscciValues1 {

	public static void main(String[] args) {
		char[] ch= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	   // String s=new String(ch);
	    //System.out.println(s);
		String s=new String(ch);
		System.out.println(s);
		String vowels="";
		String consonants="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a' && c<='z') {
				if(c=='a' || c=='e' || c=='i'||c=='o'||c=='u') {
					vowels+=c;
					
				}
				else {
					consonants+=c;
				}
			}
		}
		System.out.println(vowels);
		System.out.println(consonants);
		
	}

}
