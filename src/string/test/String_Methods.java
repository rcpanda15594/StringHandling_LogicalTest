package string.test;

public class String_Methods {

	public static void main(String[] args) {

		String s = "1.04";
		
		Double d = Double.valueOf(s);
		int i =  Integer.parseInt(s);
		
		
		System.out.println(d);
		
		String s1 = d.toString();
		System.out.println(s1);
	}

}
