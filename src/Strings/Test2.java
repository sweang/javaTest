package Strings;

public class Test2 {
	public static void main(String[] args){
		String s = "javahhgfdgfdgfdgfdgdfgdfgdfgjava";
		int count =0;
		int j = 0;
		
		for(int i = 0; i<s.length();i=(s.indexOf("java",i)+4)){
			System.out.println("adsad"+i);
			j++;
			if(i==0&&!s.substring(0, 0+4).equals("java")){
				continue;
			}
			count ++;
		}
		System.out.println(s.length());
		System.out.println(s.length()/4+1);
		System.out.println(j);
		System.out.println("Ò»¹²"+count+"¸öjava");
		//		int i = 0;
//		int n = 0; 
//		for(int j=0; j<(s.length()/4+1);j++){
//			n = s.indexOf("java", n+1);
//			i++;
//		}
//		System.out.println(i);
	}
}
