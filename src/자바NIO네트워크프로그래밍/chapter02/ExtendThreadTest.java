package 자바NIO네트워크프로그래밍.chapter02;

public class ExtendThreadTest extends Thread {
	
	// 객체 자체가 스레드 역할을 할 수 있도록 하는 방법  --> white box
	
	// run() 을 오버라이딩 해서 재정의 한다. 
	public void run() {
		System.out.println("Thread 클래스를 상속");
	}
	

	public static void main(String[] args) {
		
		Thread t = new ExtendThreadTest();
		t.start();
		
		
		
		

	}

}
