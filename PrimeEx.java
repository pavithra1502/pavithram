import java.util.Scanner;

public class PrimeEx {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int n=s.nextInt();
		int half=n/2;
		int flag=0;
		for(int i=2;i<half;i++){
			if(n%i==0){
				flag=1;
			}}
			if(flag==0){
				System.out.println(" prime no");
			}
			else{
				System.out.println("not a prime no");
			
		}
	}

}
