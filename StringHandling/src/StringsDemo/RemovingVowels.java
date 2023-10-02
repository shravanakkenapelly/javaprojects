package StringsDemo;
import java.util.Scanner;
public class RemovingVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter your name");
		String name=sc.next();
		sc.close();
		name=name.toLowerCase();
		String vowels="";
		String consonants="";
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
		if(c>='a' && c<='z') {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowels=vowels+c;
			}
			else {
				consonants=consonants+c;
			}
		}
			
			
		}
		System.out.println(vowels);
		System.out.println(consonants);
	   

	}

}
