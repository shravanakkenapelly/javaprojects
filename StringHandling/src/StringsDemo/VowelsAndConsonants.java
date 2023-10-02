package StringsDemo;
/*
public class RemoveVowels {

	public static void main(String[] args) {
		String s="Shravan";
	   s=s.toLowerCase();
	   System.out.println(s);
	  for(int i=0;i<s.length();i++) {
		  char ch=s.charAt(i);
		  if(ch>='a' && ch<='z') {
			  int count=0;
		  if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		 
			
			System.out.println(ch);
		  }
		  }
	  }
	}

}
*/
import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        input = input.toLowerCase(); // Convert the input to lowercase to handle both uppercase and lowercase characters.

        int vowelsCount = 0;
        int consonantsCount = 0;
        String vowels = "";
        String consonants = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') { // Check if the character is an alphabet letter.
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                    vowels += ch + " ";
                } else {
                    consonantsCount++;
                    consonants += ch + " ";
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Consonants: " + consonants);
        System.out.println("Number of consonants: " + consonantsCount);
    }
}