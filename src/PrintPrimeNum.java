import java.util.Scanner;
public class PrintPrimeNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Write a program to print all prime numbers between 1 to n		
		int num,i,j,count;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n th value");
		num=sc.nextInt();
	    System.out.println("prime numbers between 1 to "+num);
        for(i=2;i<=num;i++)
        { 
        	count=0;
        	for(j=1;j<=i;j++)
        	{
        		if(i%j==0)
        		{
        			count++;
        			
        		}
        	}
         if(count==2)
         {
        	 System.out.println(i);
         }
        }
	}
}
