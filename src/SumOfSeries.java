import java.util.Scanner;
public class SumOfSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Sum of Series:
		// 1+2+3+......+n
		int num;
		int sum=0;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n th Number");
        num=sc.nextInt();
        int i=1;
        while(i<=num)
        {
        	sum=sum+i;
        	i=i+1;
        }
		System.out.println("Sum of the series is "+sum );
        sc.close();
	}
}

