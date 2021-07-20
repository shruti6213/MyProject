import java.util.Scanner;
public class SumOfEvenOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Write a program to find sum of all even and odd numbers between 1 to n
		int num,i;
		int sum=0;
		int sum1=0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the n th number:");
			num=sc.nextInt();
			for(i=1;i<=num;i++)
			{
				if(i%2==0)
				{
					sum+=i;
				}	

				if(i%2!=0)
				{
					sum1+=i;
				}
		
			}
			System.out.println("addition of all even numbers are "+sum);
			System.out.println("addition of all odd numbers are "+sum1);
			sc.close();
		}
	}
}
