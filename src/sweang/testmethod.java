package sweang;

public class testmethod {
	public static void main(String[] args){
		m();
		m2(5);
		m3('3',4);
		m4(4,6);
		int i = m4(4,6);
		System.out.println(i);
	}
	
	public static void m(){
		//return;
		System.out.println("OK");
		System.out.println("hello");
	}
	
	public static void m2(int i){
		if(i > 3)
			return;
		System.out.println(i);
	}
	
	public static void m3(int i, int j){
		System.out.println(i + j);
	}
	
	public static int m4(int i, int j){
		return i > j ? i : j;
	}
}
