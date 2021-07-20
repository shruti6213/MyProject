import java.util.Scanner;
public class ArmstrongNo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Write a program to check entered number is armstrong number or not
// 153=1^3+5^3+3^3=153		
		int num;
		int r;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		int temp;
		temp=num;
		while(temp!=0)
		{
			r=temp%10;
			System.out.println(r);
			sum+=r*r*r;
			temp=temp/10;	
			System.out.print("---------");
			System.out.println(temp);
		}
		if(sum==num)
		{
			System.out.println("given number "+num+ " is armstrong number");
		}
		else
			System.out.println("given number "+num+" is not a armstrong number");
	sc.close();
	}
}
