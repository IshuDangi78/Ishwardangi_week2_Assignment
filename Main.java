package Week2;

 class Calculator
{

	public Calculator()
	{
		System.out.println("Calculator object created");
	}
	public Calculator(int initialValue)
	{
		System.out.println("Calculator initialize with value : "+ initialValue);
	}
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public double add(double a,double b) 
	{
		return a+b;
	}
	public double add(double a,double b,double c) 
	{
		return a+b+c;
	}
	

}
 public class Main
 {
	 public static void main(String[] args) 
		{
		Calculator c1=new Calculator();
		Calculator c2= new Calculator(100);
		
		int sum1=c1.add(12, 13);
		int sum2=c1.add(5, 6, 7);
		
		double sum3=c1.add(14.3, 13.2);
		double sum4=c1.add(12.3, 345.6, 678.9);
		
		System.out.println("Sum of two Integers : "+sum1);
		System.out.println("Sum of three Integers : "+sum2);
		System.out.println("Sum of two doubles : "+sum3);
		System.out.println("Sum of three doubles :"+sum4);

		}
 }
