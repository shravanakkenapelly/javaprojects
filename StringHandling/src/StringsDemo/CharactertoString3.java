package StringsDemo;

public class CharactertoString3 {

	public static void main(String[] args) {
		//conveerting group of characters to string
		char[] ch= {'a','b','c','d','e','f','g'};
		//System.out.println(ch);
		String s=new String(ch);
		System.out.println(s);
		/*StringBuffer sb=new StringBuffer();
		for(char c:ch) {
			sb.append(c);
		}
		//String s=sb.toString();
      System.out.println(sb);
	}*/
	}
}
