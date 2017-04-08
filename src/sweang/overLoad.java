package sweang;

public class overLoad {
	public static void main(String[] args){
		person p = new person();
		person p1 = new person();
		//person p2 = new person("45");
		p.info();
		p.info("OK");
	}
}

class person{
	person(){
		id = 100;
		age = 25;
	}
	
	person(int _id){
		id = _id;
		age = 30;
	}
	
	person(int _id, int _age){
		id = _id;
		age = _age;
	}
	
	private int id;
	private int age = 20;
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int i){
		age = i;
	}
	
	public int getId(){
		return id;
	}
	
	void info(){
		System.out.println("my id is : " + id);
	}
	
	void info(String t){
		System.out.println(t + " id " + id);
	}
}