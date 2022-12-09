package 자바NIO네트워크프로그래밍.chapter02;

public class RunnableThreadTest implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Runnable 인터페이스를 구현");
	}

	public static void main(String[] args) {
		// 스레드 구현의 또다른 방법은 Runnable 인터페이스를 구현하는 클래스를 만들어 새로운 Thread 클래스를 생성할 때 앞서 구현한 클래스를 파라미터로 넘기는 방식이다. 
		// 객체 합성이라고 할 수 있다.
		
		// Thread 생성자에 RunnableThread 인터페이스를 파라미터로 전달한다. 
		// 객체 합성
		
		Thread t = new Thread(new RunnableThreadTest()); // 파라미터로 객체를 주었을 떄 객체 합성이라고 한다.
		
		t.start();
		

	

	
	}

}
