
public class GreatestNo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Write a program to find greatest numbers using nested if-else
		int no1=100;
		int no2=520;
		int no3=80;
		System.out.println("among the no "+no1+","+no2+","+no3+" the greatest number is");
	
		if(no1>=no2&&no1>=no3)
			System.out.println(no1);
		else
		{
			if(no2>=no1&&no2>no3)
			{
				System.out.println(no2);
			}
			else
			{
				System.out.println(no3);
			}
		}	
	}
}
