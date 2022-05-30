
public class Calculator {

	public int add(int a, int b) {
		if (isValid(a, b)) {
			return a + b;
		} else {
			return -1;
		}
	}

	public int subtract(int a, int b) {
		if (isValid(a, b)) {
			return a - b;

		} else {
			return -1;
		}
	}

	public int multiple(int a, int b) {
		if (isValid(a, b)) {
			return a * b;

		} else {
			return -1;
		}
	}

	public int divide(int a, int b) {
		if (isValid(a, b)) {
			return a / b;

		} else {
			return -1;
		}
	}

	private boolean isValid(int a, int b) {
		if (a >= 0 && a <= 9999 && b >= 0 && b <= 9999) {
			return true;

		}else {
		return false;
		}
	}
}
