package strings;
import java.util.Scanner;
public class NLengthStringFromKLength {

	public void print(int n, char[] k, char[] A) {
		if (n <= 0) {
			System.out.print(String.valueOf(A) + " ");
		} else {
			for (int i = 0; i < k.length; i++) {
				A[n - 1] = k[i];
				print(n - 1, k, A);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		scan.close();

		for (int i = 0; i < num; i++) {
			Scanner scan1 = new Scanner(System.in);
			String k = scan1.nextLine();
			int n = scan1.nextInt();
			scan1.close();
			NLengthStringFromKLength  str1 = new NLengthStringFromKLength();
			str1.print(n, k.toCharArray(), new char[n]);
		}
	}
}