
 import java.util.ArrayList;
 import java.util.Scanner;
 
 public class Subset 
 {
 	public static void main(String[] args) 
 	{
 		System.out.println("enter the 1st array length");
 	 Scanner scan=new Scanner(System.in);
 	 int n=scan.nextInt();
 	 int[]array=new int[n];
 	  for(int i=0;i<n;i++)
 	  {
 		  array[i]=scan.nextInt();
 	  }
 	  System.out.println("Enter the 2nd array length");
 	  Scanner scan1=new Scanner(System.in);
 	  int n1=scan1.nextInt();
 	  int[]array1=new int[n1];
 	  for(int i=0;i<n1;i++)
 	  {
 		  array1[i]=scan1.nextInt();
 	  }
 	  ArrayList<Integer> al=new ArrayList<Integer>();
 	  ArrayList<Integer> al1=new ArrayList<Integer>();
	 for(int i=0;i<array.length;i++)
 	 {
 		 al.add(array[i]);
	 }
 	 for(int j:array1)
 	 {
 		 if(al.contains(j))
 		 {
 			al1.add(j); 
 		 }
 	 }
 	 System.out.println(al1);
 	}
 
 }
