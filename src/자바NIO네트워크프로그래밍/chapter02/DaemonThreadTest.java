package 자바NIO네트워크프로그래밍.chapter02;

public class DaemonThreadTest { // 나쁜일들은 데몬(악마)가 하고 보이지 않는 곳에서 한다.
								// 즉 백 그라운드 스레드라는 뜻이다. 

	public static void main(String[] args) {
		// 자바프로그래밍을 하면서 백그라운드 작업을 할 때가 종종 있는데 
		// JVM안의 가비지 컬렉션 같은 작업이 대표적인 예다. 
		// 자바에서는 이런 백그라운드 서비스를 위해 데몬 스레드라는 개념을 도입했다. 
		
		Thread t = new Thread() {
			public void run() {
				try {
					Thread.sleep(5000);
					System.out.println("Mythread 종료");
				} catch (InterruptedException e) {
					// TODO: handle exception
				}
			}
		} ;
		
	t.setDaemon(true); // 데몬 스레드로 선정
	t.start();
		
	System.out.println("main() 종료");
	}

}
