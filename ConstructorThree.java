public class ConstructorThree{
	String web;
	ConstructorThree(String w)
	{
		web = w;

	}

	ConstructorThree(ConstructorThree je)
	{
		web= je.web;
	}
	void display(){
		System.out.println("website:"+web);
	}
	public static void main(String[] args){

		ConstructorThree obj1 = new ConstructorThree("www.dsfdsf.com");

		ConstructorThree obj2= new ConstructorThree(obj1);

		obj1.display();
		obj2.display();
	}
}