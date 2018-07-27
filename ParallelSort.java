import java.util.Arrays;


public class ParallelSort{

	public static void main(String[] args) {
		int num[]={22,89,1,32,19,5};

		Arrays.parallelSort(num,1,5);
			Arrays.stream(num).forEach(n->System.out.println(n+" "));

	}
}