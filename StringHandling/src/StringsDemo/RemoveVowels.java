package StringsDemo;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.next();
		sc.close();
		name=name.toLowerCase();
		String vowels="";
		String consonants="";
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch>='a' && ch<='z') {
				if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					vowels+=ch;
				}
				else {
					consonants+=ch;
				}
			}
		}
		System.out.println("Removing vowels:"+vowels);
		System.out.println("after removing vowels the name is:"+consonants);
	}

}
