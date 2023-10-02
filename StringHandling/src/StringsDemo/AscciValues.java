package StringsDemo;

public class AscciValues {

	public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxyz";
		String s1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[]ch=s.toCharArray();
		for(char ch1:ch) {
			int value=(int)ch1;
			System.out.println("Character "+ch1+" Value"+value);
		}
		char[]ch2=s1.toCharArray();
		for(char ch3:ch2) {
			int value1=(int)ch3;
			System.out.println("Character "+ch3+" Value "+value1);
		}
		}

}
