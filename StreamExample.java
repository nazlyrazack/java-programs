import java.util.ArrayList;
import java.util.List;

public class StreamExample{
	public static void main(String[] args){

		List<String>names = new ArrayList<String>();

		names.add("Monica");
		names.add("Ross");
		names.add("Chandler");
		names.add("Joey");
		names.add("Pheobe");
		names.add("Rachel");


		long count = names.stream().filter(str->str.length()<6).count();
		System.out.println("There are"+count+"strings with length less than 6");
	}
}

