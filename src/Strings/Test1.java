package Strings;

public class Test1 {
	public static void main(String[] args){
		int j = 1234567;
		String sNumber = String.valueOf(j);
		System.out.println("jÊÇ" + sNumber.length() + "Î»Êý");
		String s = "Mary,F,1976";
		String[] sPlit = s.split(",");
		for(int i=0;i<sPlit.length;i++){
			System.out.println(sPlit[i]);
		}
	}
}
