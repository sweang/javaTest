package sweang;

class birthDate {
	private int day;
	private int month;
	private int year;
	
	public birthDate(int d, int m, int y){
		day = d;
		month = m;
		year = y;
	}
	
	public void setDay(int d){
		day = d;
	}
	
	public void setMonth(int m){
		month = m;
	}
	
	public void setYear(int y){
		year = y;
	}
	
	public int getDay(){
		return day;
	}
	
	public int getMonth(){
		return month;
	}
	
	public int getYear(){
		return year;
	}
	
	public void display(){
		System.out.println(day + "-" + month + "-" + year);
	}
}


public class test6{
	public static void main(String args[]){
		test6 test = new test6();
		int date = 9;
		birthDate d1 = new birthDate(7,7,1970);
		birthDate d2 = new birthDate(1,1,2000);
		test.change1(date);
		test.change2(d1);
		test.change3(d2);
		System.out.println("date=" + date);
		d1.display();
		d2.display();
	}
	
	public void change1(int i){
		i = 1234;
	}
	
	public void change2(birthDate b){
		b = new birthDate(22,2,2004);
	}
	
	public void change3(birthDate b){
		b.setDay(22);
	}
}
