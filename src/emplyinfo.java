import java.util.Scanner;

public class emplyinfo {
	public static void main(String[] args) {
		int empid;
		String name;
		String address;
		double salary;
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter the empid");
		empid=sc.nextInt();
		System.out.println("Empid="+empid);
		System.err.println("Enter name");
		name=sc.next();
		System.out.println("Name="+name);
		System.err.println("Enter address");
		address=sc.next();
		System.out.println("Address="+address);
		System.err.println("Enter salary1");
		salary=sc.nextDouble();
		System.out.println("Salary="+salary);
		sc.close();
	}

}
