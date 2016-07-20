import java.util.Scanner;


public class Reverse {

	

	public static void main(String[] args) {
		String n;
		String rev="";
		System.out.println("enter the string:");
	Scanner s=new Scanner(System.in);
	n=s.nextLine();
	for(int i=n.length()-1;i>=0;i--){
	rev=rev+n.charAt(i);
	}
		if(n.equals(rev))
			System.out.println("string reverse");
	else
		System.out.println("it is not a string reverse");

	}
	}
