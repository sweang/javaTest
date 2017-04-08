package TestAbstract;

abstract class Animal{
	private String name;
	Animal(String name){ this.name = name;}
	/*
	public void enjoy(){
		System.out.println("jiao sheng");
	}
	*/
	public abstract void enjoy(); 
}

class Cat extends Animal{
	private String eyescolor;
	Cat(String n, String c){
		super(n);
		eyescolor = c;
	}
		public void enjoy(){
			System.out.println("mao jiao sheng");
		
		}
}

class Dog extends Animal{
	private String furcolor;
	Dog(String n, String c){
		super(n);
		furcolor = c;
	}
	public void enjoy(){
		System.out.println("gou jiao sheng");
	}
}

class Lady{
	private String name;
	private Animal pet;
	Lady(String name, Animal pet){
		this.name = name;
		this.pet = pet;
	}
	public void myPetEnjoy(){
		pet.enjoy();
	}
}

public class Test {
	public static void main(String[] args){
		Cat c = new Cat("c", "blue");
		Dog d = new Dog("d", "black");
		Lady l1 = new Lady("l1", c);
		Lady l2 = new Lady("l2", d);
		l1.myPetEnjoy();
		l2.myPetEnjoy();
	}
}
