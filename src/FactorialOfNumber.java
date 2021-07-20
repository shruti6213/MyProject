import java.util.Scanner;
public class FactorialOfNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Factorial of the given number		
		int num;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc1.nextInt();
		int sum=1;
		int i;
		for(i=1;i<=num;i++)
		{
			sum=sum*i;
			System.out.println(sum);
		}
		System.out.println("Factorial of the given number is:"+sum);
		sc1.close();		
	}
}
