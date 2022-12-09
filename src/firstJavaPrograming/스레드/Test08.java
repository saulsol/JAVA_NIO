package firstJavaPrograming.스레드;

public class Test08 {

	public static void main(String[] args) {
		
		PrintThread t = new PrintThread();
		t.start();
	}

}

class PrintThread extends Thread {
	
	public void run() {
		try {
			for(int i=0; i<10; i++) {
				Thread.sleep(1000);
				System.out.println("출력 : " + i);
			}
			
		} catch (InterruptedException e) { // 스레드가 중단되었을 경우 발생하는 에러
			System.out.println("InterruptedException 이 발생하여 Sleep 상태를 종료함");
		}
	}
	
	
}