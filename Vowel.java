import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("the given character is vowel");
			break;

		default:
			System.out.println("the given character  is consonant");
			break;
		}
	}

}
