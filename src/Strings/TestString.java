package Strings;

public class TestString {
	public static void main(String [] args){
		String s = "AaaaBbbbCccc!@#$123456";
		int iCount = 0,uCount = 0, oCount = 0;
//		for(int i=0;i<s.length();i++){
//			char c = s.charAt(i);
//			if(c >= 'a' && c <= 'z'){
//				iCount++;
//			}else if(c >= 'A' && c <= 'Z'){
//				uCount++;
//			}else{
//				oCount++;
//			}
//		}
//		
		/*String sL = "abcdefghijklmnopqrstuvwxyz";
		String sU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(sL.indexOf(c) != -1){
				iCount++;
			}else if(sU.indexOf(c) != -1){
				uCount++;
			}else{
				oCount++;
			}
		}*/
		
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(Character.isLowerCase(c)){
				iCount++;
			}else if(Character.isUpperCase(c)){
				uCount++;
			}else{
				oCount++;
			}
		}
		
		System.out.println(iCount + " " + uCount + " " + oCount);
	}
}
