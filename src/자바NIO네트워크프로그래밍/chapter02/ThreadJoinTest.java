package 자바NIO네트워크프로그래밍.chapter02;

public class ThreadJoinTest {

	public static void main(String[] args) {
		
		Thread t = new Thread() {			
			public void run() {
				try {
					Thread.sleep(2000);
					System.out.println("MyThread 종료");
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
				}
				
				
			}
			
		};
		
		t.start();
		try {
			t.join(); // t 스레드가 종료될 때 까지 main() 메서드가 기다린다. 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main() 메서드 종료");
		
	}
	
	
	

}
