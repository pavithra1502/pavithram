import java.io.InputStream;
import java.util.Scanner;

public class Factorial {
public static void main(String[] args){
	int s,num;
	
	Scanner fac= new Scanner(System.in);
	 num=fac.nextInt();
	 s=num;
	for(int i = 1;i<num;i++){
		s=s*i;
	}
	System.out.println("factorial:"+s);
}



}
