public class OverloadingOne{
	void disp(char c){
		System.out.println(c);
	}

	void disp(char c, int num){;
		System.out.println(c+ ","+num);
	}
}
class Sample{
	public static void main(String[] args){
		OverloadingOne obj = new OverloadingOne();
		obj.disp('a');
		obj.disp('a',10);
	}
}