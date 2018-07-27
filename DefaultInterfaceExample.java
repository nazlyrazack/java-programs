interface MyInterface{

		// default void newMethod(){

		//  	System.out.println("This is the default method");
		//  }

		void ExistingMethod(String str);
}

public class DefaultInterfaceExample implements MyInterface{

	public void ExistingMethod(String str){
			System.out.println("The string is : "+str);
		}

	public static void main(String[] args){


		

		DefaultInterfaceExample obj = new DefaultInterfaceExample();

		 // obj.newMethod();
		obj.ExistingMethod("qwerty");
		
	}
}