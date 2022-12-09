package 자바NIO네트워크프로그래밍.chapter02;

class PriorityThread implements Runnable{
	
	// isInterrupted () 메소드를 while문 조건으로 사용한다.
	// 만약, 이 스레드에서 interrupt() 메소드를 호출하면 
	// isInterrupted() 메소드는 true를 리턴해서 while문을 빠져나가게 된다

	@Override
	public void run() {
		try {
			
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("Priority : " + Thread.currentThread().getPriority());
				System.out.println("MyThread 잠든다");
				Thread.sleep(500);
			}
			
		}catch (InterruptedException e) {
			
		}
		
		System.out.println("MyThread 끝");		
	}
	
}





public class PriorityThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread(new PriorityThread());
		t.start();
		System.out.println("메인 잠든다");
		Thread.sleep(500);
		
		System.out.println("메인 깼다");
		t.setPriority(Thread.MIN_PRIORITY);
		System.out.println("메인 잠든다");
		Thread.sleep(500);
		
		System.out.println("메인 깼다");
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println("메인 잠든다");
		Thread.sleep(500);
		
		System.out.println("메인 깼다");
		t.setPriority(8);
		

		t.interrupt();
		System.out.println("메인 함수 끝");
		

	}

}
