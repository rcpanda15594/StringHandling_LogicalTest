package string.test;

public class CustomImmutableClassTest {

	public static void main(String[] args) {

		
		CustomImmutableClass cus = new CustomImmutableClass(10);
		
		CustomImmutableClass cus1 = cus.modify(100);
		CustomImmutableClass cus2 = cus.modify(10);

		CustomImmutableClass cus3 = new CustomImmutableClass(10);

		System.out.println(cus == cus1);
		System.out.println(cus == cus2);
		System.out.println(cus == cus3);

	}

}
