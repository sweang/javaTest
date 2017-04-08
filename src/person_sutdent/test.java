package person_sutdent;

class Person{
	private String name;
	private String location;
	
	Person(String name){
		this.name = name;
		location = "Beijing";
	}
	
	Person(String name,String location){
		this.name = name;
		this.location = location;
	}
	
	public String info(){
		return "name:" + name + "location" + location;
	}
}

class Student extends Person{
	private String school;
	Student(String name,String school){
		this(name,school,"Beijing");
	}
	Student(String n, String l, String school){
		super(n,l);
		this.school = school;
	}
	public String info(){
		return super.info() + "school:" + school;
	}
}

public class test {
	public static void main(String[] args){
		Person p1 = new Person("A");
		Person p2 = new Person("B","Shanghai");
		Student s1 = new Student("C","S1");
		Student s2 = new Student("C","Shanghai","S2");
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(s1.info());
		System.out.println(s2.info());
	}
}
