public class Constructor{
	String name;
		Constructor()
		{
			this.name="qwerty";
		}
	public static void main(String[] args){
		Constructor obj = new Constructor();
		System.out.println(obj.name);
	}
}