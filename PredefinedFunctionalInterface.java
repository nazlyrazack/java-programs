import java.util.function.IntBinaryOperator;


public class PredefinedFunctionalInterface{

	public static void main(String[] args) {


		IntBinaryOperator sum = (a,b)->a+b;

		System.out.println("Sum = " +sum.applyAsInt(100,200));
		
	}
}