package StringsDemo;

public class StringtoCharacter1 {

	public static void main(String[] args) {
		//to create string anything we can use
		StringBuffer s=new StringBuffer("aniket");
		//String s="Shravankumar";
		int length=s.length();
		//create array to store characters
		char[] ch=new char[length];
		for(int i=0;i<length;i++) {
			ch[i]=s.charAt(i);
		}
		//print array characters
		for(char c1:ch) {
		System.out.println(c1);
		}
	}

}
