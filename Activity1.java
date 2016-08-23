import java.util.Scanner;

public class Activity1 {
public static void main(String[] args) {
	String a=" ";
	Scanner s= new Scanner(System.in);
	a=s.nextLine();
	StringBuffer buffer = new StringBuffer(a);
    buffer.reverse();
    System.out.println(buffer);
    
	int count=0;
	for(int i=0;i<a.length();i++){
		count=0;
		for(int j=0;j<=i;j++){
			if(a.charAt(i)==a.charAt(j)){
				count++;
			}	
		}
		if(count>1){
			System.out.println(a.charAt(i)+" "+count);	
		}
	}
}
}
