class Encapsulation{


	private int num;
	private String name;
	private int age;

	public int getnum()
	{
		return num;
	}

	public String getname()
	{
		return name;
	}
	public int getage(){
		return age;
	}

	public void setnum(int newvalue){
		num = newvalue;
	}
	public void setname(String  newvalue){
		name = newvalue;
	}
	public void setage(int newvalue){
		age = newvalue;
	}


	
}
public class Sample{
	public static void main(String[] args){

		Encapsulation obj = new Encapsulation();

		obj.setnum(1);
		obj.setname("nazly");
		obj.setage(20);

		System.out.println(obj.getnum());
		System.out.println(obj.getname());
		System.out.println(obj.getage());

	}
}