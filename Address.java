class Address{
	int streetNo;
	String city;
	String state;
	String country;

	Address(int no, String c,String s,String co){
		this.streetNo = no;
		this.city = c;
		this.state = s;
		this.country = co;
	}
}
class Student{
	int id;
	String stud_name;

	Address stud_address;

	Student(int roll , String name , Address adr){
		this.id = roll;
		this.stud_name = name;
		this.stud_address = adr;

	}
	public static void main(String[] args){

		Address ad = new Address(10,"thrissur","kerala","india");
		Student st = new Student(1,"Ross",ad);
		System.out.println(st.id);
		System.out.println(st.stud_name);

		System.out.println(st.stud_address.streetNo);
		System.out.println(st.stud_address.city);
		System.out.println(st.stud_address.state);
		System.out.println(st.stud_address.country);

	}
}