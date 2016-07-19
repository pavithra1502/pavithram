public class EvenOddZero {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
				int a=s.nextInt();
				if(a==0){
					System.out.println("The given value is zero");}
					else if(a%2==0){
						System.out.println("The given value is even");
					}
					else{
						System.out.println("The given number is odd");
				}
	}

}
