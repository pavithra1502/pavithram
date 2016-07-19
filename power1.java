import java.util.Scanner;

class power1
{

    void pow(int e, int d)
    {       
             int n=1;
            for(int i=0;i<d;i++)
              {
                      n=e*n;
              }
             System.out.println(n);
     } 
}
public class Power
{
    public static void main(String arg[])
    {
    int a,b;
    Scanner sc=new Scanner(System.in);                          
    System.out.println("Enter the number you want to get multiplied");
    a=sc.nextInt();
    System.out.println("Enter the power");
    b=sc.nextInt();
        power1 c=new power1();
        c.pow(a,b);
    }
}
