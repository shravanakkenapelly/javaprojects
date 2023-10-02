package StringsDemo;

public class CharacterstoString1 {

	public static void main(String[] args) {
		//character converted to string using String.valueOf(char)
        char c='r';
        String s=String.valueOf(c);
        System.out.println(s);
        //a group of characters converted to string
        char[] ch= {'a','e','i','o','u'};
        String s1=String.valueOf(ch);
        System.out.println(s1);
        
	}

}
