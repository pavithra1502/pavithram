import java.util.Scanner;

public class Prime {
	public static void main(String args[]) {
		int s1, s2, s3, f = 0, i, j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the lower limit :");
		s1 = s.nextInt();
		System.out.println("Enter the upper limit :");
		s2 = s.nextInt();
		System.out
				.println("The prime numbers in between the entered limits are :");
		for (i = s1; i <= s2; i++) {
			for (j = 2; j < i; j++) {
				//System.out.println(j);
				if (i % j == 0) {
					f = 0;
					break;
				} else {
					f = 1;
				}
			}
			if (f == 1) {
				System.out.println(i);
			}
		}
	}
}
