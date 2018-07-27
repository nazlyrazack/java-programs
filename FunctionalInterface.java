// @FunctionalInterface

interface MyFunctionalInterface
{
	public int add(int a , int b);
}

public class FunctionalInterface{

	public static void main(String[] args) {
		
		MyFunctionalInterface sum =(a,b) -> a+b;

		System.out.println("sum ="+sum.add(10,20));
	}
}