import java.util.Scanner;
public class PowerOfNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Write a program to calculate power of the number
		int base;
		int exponent;
		int i;
		int result=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base value");
		base=sc.nextInt();
		System.out.println("Enter the exponent value");
		exponent=sc.nextInt();
		for(i=1;i<=exponent;i++)
		{
			result=result*base;		
		}
		System.out.println("Power of "+ base+" "+"raise"
				+ " " + "to"+" " + exponent +" " +"is" + " "+result);
		sc.close();
	}
}
