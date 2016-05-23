import java.util.Arrays;

public class Main {

	public static void main(String[] args)throws java.lang.Exception {
		int a[] = { 1, 2, 3, 3, 2, 1 };
		System.out.println(Arrays.toString(a));
		System.out.println("Size is: " + a.length);
		boolean symmetric = true;
				
		for (int i = 0; i < a.length / 2; i++) {
			if (a[i] != a[a.length - i - 1]) { 																						// елементи
				symmetric =false;
				break;
			}
		}		
				System.out.println("Symmetric: " + symmetric);
	}
}