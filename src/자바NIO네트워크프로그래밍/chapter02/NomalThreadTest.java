package 자바NIO네트워크프로그래밍.chapter02;

public class NomalThreadTest {

	public static void main(String[] args) {

		Thread t = new Thread() {
			public void run() {
				try {
					Thread.sleep(5000);
					System.out.println("My Thread 종료");
					
				} catch (Exception e) {
					
				}
			}
			
		};
		
		t.start();
		
		
		System.out.println("main() 메서드 종료");
		
	}

}
// 자바에서는 애플리케이션 내부의 모든 스레드가 종료되지 않으면 JVM은 종료되지 않는다. 