public class ConstructorTwo{
	int empid;
	String empname;
	ConstructorTwo(int id,String name){
			this.empid = id;
			this.empname=name;


		}
		void display(){

			System.out.println("id : "+empid +"\n name : "+empname);
		}
	public static void main(String[] args){

		
		
		ConstructorTwo obj1 = new ConstructorTwo(1,"monica");
		ConstructorTwo obj2 = new ConstructorTwo(2,"rachel");

		obj1.display();
		obj2.display();
	}
}