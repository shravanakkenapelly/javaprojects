package StringsDemo;

public class NumbeerstoCharactors {

	public static void main(String[] args) {
		
		int[] numbers= {65,66,67};
		StringBuilder s=new StringBuilder();
		for(int num:numbers) {
			s.append((char)num);
		}
		System.out.println(s);
		int[] b= {65,66,67};
	//	char c=(char)b;
		/*
		int b=65;
		char c=(char)b;
		System.out.println(c);
		char[] ch
*/
	}

}
