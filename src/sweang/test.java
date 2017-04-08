package sweang;

public class test {
	public static void main(String arg[]){
		int i1 = 10, i2 = 20;
		int i = (i2++);
		System.out.print("i=" + i);
		System.out.println("i2=" + i2);
		i = (++i2);
		System.out.print("i=" + i);
		System.out.println("i2=" + i2);
		i = (--i1);
		System.out.print("i=" + i);
		System.out.println("i1=" + i1);
		i = (i1--);
		System.out.print("i=" + i);
		System.out.println("i1=" + i1);
		
	}

}
