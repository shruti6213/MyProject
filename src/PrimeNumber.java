import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Check if number is a prime number or not		
      int num,i;
      int flag=0;
      System.out.println("Enter the number");
      Scanner sc=new Scanner (System.in);
      num=sc.nextInt();
      for(i=2;i<num/2;i++)
      {
    	  if(num%i==0);
    	  flag=1;
      }
      if(flag!=1)
      {
		System.out.println(num+" is a prime number");
		}
      else    	  
      {
    	  System.out.println(num+" is not a prime number");   	  
     }
      sc.close();
	}
}
