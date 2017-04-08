package sweang;

public class test7 {
	void max(int a, int b){
		System.out.println(a > b ? a : b);
	}
	
	void max(float a, float b){
		System.out.println(a > b ? a : b);
	}
	
	void max(short a, short b){
		System.out.println(a > b ? a : b);
	}
	
	void max(byte a, byte b){
		System.out.println(a > b ? a : b);
	}
	
	public static void main(String[] args){
		test7 t = new test7();
		t.max(3, 4);
		short a = 5;
		short b = 6;
		t.max(a, b);
		byte c = 7;
		byte d = 8;
		t.max(c, d);
	}
}
