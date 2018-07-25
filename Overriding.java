public class Overriding{
	
	public int speedlimit()
	{
		return 100;
	}
}
class Child extends Overriding{
	public int speedlimit()
	{
		return 200;
	}
	public static void main(String[] args)
	{
		Overriding obj = new Child();

		int num = obj.speedlimit();
		System.out.println("speed limit is"+num);
	}
}