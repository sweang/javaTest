package sweang;

public class testconvert {
	public static void main(String arg[]){
		int i1 = 123;
		int i2 = 456;
		double d1 = (i1 + i2) *1.2;
		float f1 = (float) ((i1 + i2) *1.2);
		byte b1 = 67;
		byte b2 = 89;
		byte b3 = (byte) (b1 + b2);
		System.out.println(b3);
		double d2 = 1e200;
		float f2 = (float) d2;
		System.out.println(f2);
		float f3 = 1.23f;
		long l1 = 123;
		long l2 = 3000000000000l;
		float f = l1 + l2 + f3; //系统将所有的数转换成flota类型，float类型最大
		long l = (long)f;
	}
}
