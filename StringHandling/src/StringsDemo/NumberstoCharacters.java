package StringsDemo;

import java.util.Arrays;

public class NumberstoCharacters {

	public static void main(String[] args) {
	//numbers converted to string
		int b=123;
	    String s=Integer.toString(b);
		System.out.println(s);
        for(int i=0;i<s.length();i++) {
        	char c=s.charAt(i);
        
        System.out.println(c);
    
        }
	}
}
