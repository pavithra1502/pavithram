import java.util.Scanner;
public class WorkingDay {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String a=s.next();
	switch(a){
	case "monday":
		System.out.println("true");
		break;
	case "tuesday":
		System.out.println("true");
		break;
	case "wednesday":
		System.out.println("true");
		break;
	case "thursday":
		System.out.println("true");
		break;
	case "friday":
		System.out.println("true");
		break;
	case "saturday":
		System.out.println("true");
		break;
	case "sunday":
		System.out.println("false");
		break;
		default:
			System.out.println("invalid");
	}
}
}
