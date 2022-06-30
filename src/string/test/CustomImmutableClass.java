package string.test;

public final class CustomImmutableClass {

	private int i;

	CustomImmutableClass(int i) {
		this.i = i;
	}

	public CustomImmutableClass modify(int i) {
		if (this.i == i) {
			return this;
		} else {
			return (new CustomImmutableClass(i));
		}
	}

}
