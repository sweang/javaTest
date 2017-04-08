package sweang;

public class test4 {
	public static void main(String[] args){
		int num = 0,i = 1;
		while(i <= 100){
			if(i % 3 == 0){
				num++;
				System.out.println(i + " ");
			}
			if(num == 5){
				break;
			}
			i++;
		}
	}
}
