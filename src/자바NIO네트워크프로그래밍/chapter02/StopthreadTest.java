package 자바NIO네트워크프로그래밍.chapter02;

class StopThread implements Runnable {
	
	private boolean stopped = false;
	
	public void run() {
		String name = Thread.currentThread().getName(); // 스레드 이름 얻기
		System.out.println("main() 메서드에서 병령화 된 스레드 이름 = " + name);
		
		while(!stopped) { // stopped 플래그를 사용하여 while 문 조건으로 사용한다
			
			System.out.println("Thread is alive...");
			
			try {
				Thread.sleep(10000); // sleep() 메서드의 인자값은 밀리세컨드 값이라서 1000 = 1초이다 따라서 0.5 초이다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Thread is Dead..");
	}
	
	public void stop() {
		stopped = true; 
		System.out.println("while문 탈출");
	}
	
}




public class StopthreadTest {

	public static void main(String[] args) {
		// 만약 스레드를 시작시킨 다음 중지시키고 싶다면 어떻게 할까? 
		// 일단 첫번쨰 방법은 플래그를 사용하는 방법이다.
		System.out.println("메인 메서드 실행");
		StopthreadTest stt = new StopthreadTest();
		stt.process();
		
		
		System.out.println("main() 종료");
		

	}
	
	public void process () {
		// stopThread 인스턴스를 생성한 후 이 인자를 파라미터로 받는 
		// 스레드 인스턴스를 생성한 후에 출발시킨다. 
		StopThread st = new StopThread();
		Thread thread = new Thread(st);
		thread.start();
		
		
		String name = Thread.currentThread().getName(); // 스레드 이름 얻기
		System.out.println("현재 스레드 이름 = " + name);
		
	
		try {
			String name1 = Thread.currentThread().getName(); // 스레드 이름 얻기
			System.out.println("슬립 전 현재 스레드 이름 = " + name1);
		
			Thread.sleep(10000); // main() 스레드만 잔다.
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		st.stop();
	}

	 // 내가 만든 스레드는 특정 조건이 없다면 항상 main() 함수와 별개로 행동한다.
	
	
	
	
	
	

}
