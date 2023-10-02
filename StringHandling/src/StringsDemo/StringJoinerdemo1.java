package StringsDemo;

import java.util.StringJoiner;

public class StringJoinerdemo1 {

	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner(",");
		sj.add("ramu");
		sj.add("shravan");
		sj.add("harish");
		sj.add("francis");
		sj.add("ajay");
		System.out.println(sj);

	}

}
