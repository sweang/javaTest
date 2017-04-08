package sweang;

class point1{
	private int xp;
	private int yp;
	private int zp;
	
	public point1(int x, int y, int z){
		xp = x;
		yp = y;
		zp = z;
	}
	
	public void setx(int x){
		xp = x;
	}
	
	public void sety(int y){
		yp = y;
	}
	
	public void setz(int z){
		zp = z;
	}
	
	public int getx(){
		return xp;
	}
	
	public int gety(){
		return yp;
	}
	
	public int getz(){
		return zp;
	}
	
	public void display(){
		System.out.println("x=" + xp);
		System.out.println("y=" + yp);
		System.out.println("z=" + zp);
	}
	
	public void height(){
		System.out.println(Math.sqrt((xp)^2 + (yp)^2 + (zp)^2));
	}
}

public class testPoint {
	public static void main(String aegs[]){
		testPoint p = new testPoint();
		point1 p1 = new point1(1,2,3);
		point1 p2 = new point1(4,5,6);
		p.change(p1);
		p1.display();
	}
	
	public void change(point1 b){
		b.setx(8);
	}
}
