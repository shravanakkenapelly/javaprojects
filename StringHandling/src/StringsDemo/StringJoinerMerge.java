package StringsDemo;

import java.util.StringJoiner;

public class StringJoinerMerge {

	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner(",","[","]");
		sj.add("ramu");
		sj.add("shravan");
		sj.add("harish");
		sj.add("francis");
		sj.add("ajay");
		System.out.println(sj);
		StringJoiner sj1=new StringJoiner(",","[","]");
		sj1.add("ramu1");
		sj1.add("shravan1");
		sj1.add("harish1");
		sj1.add("francis1");
		sj1.add("ajay1");
		System.out.println(sj1);
		StringJoiner sj2=sj.merge(sj1);
		System.out.println(sj2);
	}

}
