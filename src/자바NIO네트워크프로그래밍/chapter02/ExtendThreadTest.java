package �ڹ�NIO��Ʈ��ũ���α׷���.chapter02;

public class ExtendThreadTest extends Thread {
	
	// ��ü ��ü�� ������ ������ �� �� �ֵ��� �ϴ� ���  --> white box
	
	// run() �� �������̵� �ؼ� ������ �Ѵ�. 
	public void run() {
		System.out.println("Thread Ŭ������ ���");
	}
	

	public static void main(String[] args) {
		
		Thread t = new ExtendThreadTest();
		t.start();
		
		
		
		

	}

}
