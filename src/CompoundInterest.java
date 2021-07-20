import java.util.Scanner;
public class CompoundInterest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Find compound amount and compound interest on the principal Rs.20,000 borrowed at 6% compounded annually for 3 years.
   double p,r,t;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Principal Value");
   p=sc.nextDouble();
   System.out.println("Enter the rate of interest Value");
   r=sc.nextDouble();
   System.out.println("Enter the time value");
   t=sc.nextInt();
   
   double Cinterest;
   double Camount;
   Camount=p*Math.pow((1+(r/100)),t);
   System.out.println("Compound amount:"+Camount);
	sc.close();
	Cinterest=Camount-p;
	System.out.println("Compound interest:"+Cinterest);
	}
}
