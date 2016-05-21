public class Main {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 3, 2, 1 };
		int size = a.length;
		int c = 0;
		System.out.println("Size is: " + size);
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] " + a[i]);

		}
		for (int i = 0; i < size / 2; i++) {
			if (a[i] == a[size - i - 1]) { 																						// елементи
				c = 1;
			} else {
				c = 2;
			}
		}
		System.out.println(c);
	}
}