package Thread;

public class TestThread6 {
	public static void main(String[] args){
		Thread t1 = new Runner6();
		t1.start();
		
		for(int i = 0; i < 50; i++){
			System.out.println("MainThread: " + i);
		}
	}
}

class Runner6 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().isAlive());
		for(int i = 0; i < 50; i++){
			System.out.println("SubThread: " + i);
		}
	}
}
