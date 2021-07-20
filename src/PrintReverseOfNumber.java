import java.util.Scanner;
public class PrintReverseOfNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to enter a number and print its reverse
		int num;
		int q,r,a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();		
		r=num%10;
		q=num/10;
		a=q%10;
		b=q/10;
		System.out.println("Reverse number: "+r+a+b);
		sc.close();
	}
}
