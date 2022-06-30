package string.test;

import java.util.Arrays;

public class DiffBetween_Split_SubString {

	public static void main(String[] args) {

		String s = "Hari NIT";
		
		System.out.println(s);
		String sub1 = s.substring(5);
		String sub2 = s.substring(0,5);

		System.out.println(sub1);
		System.out.println(sub2);		System.out.println(sub2.length());


		String[] split = s.split("|");
		
		System.out.println(Arrays.toString(split));
	}

}
