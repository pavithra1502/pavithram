public class NegativeAndNonNeg {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int count=0;
	int value[]=new int[5];
	int l=0;
	for(int i=0;i<5;i++){
		 value[i]=s.nextInt();
		if(value[i]>=0){
			count++;
			
		}
		else if(value[i]<0)
			l++;
			}
	System.out.println();
	System.out.println("count the postive number:"+count);
	System.out.println("count the negative number:"+l);}

}
