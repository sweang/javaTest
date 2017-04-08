package TestTeacher;

public class TestEquals {
	public static void main(String[] args){
		Cat c1 = new Cat(1, 2, 3);
		Cat c2 = new Cat(1, 2, 3);
		System.out.println(c1 == c2);
	}
}

class Cat{
	int color;
	int height,weight;
	
	public Cat(int color, int height, int weight){
		this.color = color;
		this.height = height;
		this.weight = weight;
	}
}