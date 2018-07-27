import java.util.StringJoiner;



public class StringJoinerExample{
	
	public static void main(String[] args) {
		StringJoiner mystring = new StringJoiner("-");

		mystring.add("Monica");
		mystring.add("Chandler");

		System.out.println(mystring);
	}

}