import java.util.List;
import java.util.ArrayList;
public class Foreach{
	public static void main(String[] args){
		List<String>fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Pomegranate");
		fruits.add("Pear");
        fruits.forEach(str->System.out.println(str));
	}
}