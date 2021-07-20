import java.util.Scanner;
public class Addition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Additin of 2 numbers
	
	    int no1,no2,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1 no");
		no1=sc.nextInt();
		System.out.println("Enter the 2 no");
		no2=sc.nextInt();
		result=no1+no2;
        System.out.println("Result="+result);
        
        //Addition of two characters
        char a='a';
        char b='b';
        String res=""+a+b;
        System.out.println("add of character="+res);
        System.out.println(res.toUpperCase());
        System.out.println(res.length());
        //Addition of two strings  
        String s1="ram";
        String s2="sham";
        String s3=""+s1+s2;
        System.out.println("add of string="+s3);
        System.out.println(s3.length());
        sc.close();
	}
}
