package 자바NIO네트워크프로그래밍.chapter02;

class AdvancedStopthread implements Runnable { 
	//스레드를 멈추는 두번 째 방법은 interrupt() 메소드를 사용하는 방법이다. 
	// interrupt() 메소드는 현재 수행하고 있는 명령을 바로 중지시킨다.

	public void run() {
		try {
			while(!Thread.currentThread().isInterrupted()) { // isInterrupted() 메소드는 true 나 false 를 리터한다. 
				System.out.println("Thread is alive..");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
				
		}finally {
			
			System.out.println("Thread is dead..");
		}
		
	}//run


}

	


public class AdvancedStopThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdvancedStopThreadTest astt = new AdvancedStopThreadTest();
		astt.process();
		
	}
	
	public void process() {
		AdvancedStopthread ast = new AdvancedStopthread();
		Thread thread = new Thread(ast);
		thread.start();
		
		try {
			
			Thread.sleep(10000); // 선언된 블록의 메소드를 재운다. 
			
		}catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		thread.interrupt();
		
	}
	
	
	
	
	
	

}
