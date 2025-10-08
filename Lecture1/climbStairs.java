package Lecture1;

public class climbStairs {
	public static void main(String[] args) {
		int n = 3;
		climb(n, "");
	}

	private static void climb(int n, String string) {
		if (n == 0) {
			System.out.println(string);
			return;
		}

		climb(n - 1, string + 1);
		if (n >= 2)
			climb(n - 2, string + 2);

	}

}
