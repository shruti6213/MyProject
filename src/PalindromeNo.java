import java.util.Scanner;
public class PalindromeNo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// check whether the number is palindrome or not
// 353  = 353		
		int num,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		int temp;
		int sum=0;
		temp=num;
		while(temp>0)
		{
			r=temp%10;
			System.out.println(r);
			sum=(sum*10)+r;
			System.out.println(sum);
			temp=temp/10;	
			System.out.println(temp);
		}
	 if(num==sum)
		 System.out.println("palindrome number ");
	 else
		 System.out.println("not a palindrome number");		
	}
}
