package �ڹ�NIO��Ʈ��ũ���α׷���.chapter02;

class StopThread implements Runnable {
	
	private boolean stopped = false;
	
	public void run() {
		String name = Thread.currentThread().getName(); // ������ �̸� ���
		System.out.println("main() �޼��忡�� ����ȭ �� ������ �̸� = " + name);
		
		while(!stopped) { // stopped �÷��׸� ����Ͽ� while �� �������� ����Ѵ�
			
			System.out.println("Thread is alive...");
			
			try {
				Thread.sleep(10000); // sleep() �޼����� ���ڰ��� �и������� ���̶� 1000 = 1���̴� ���� 0.5 ���̴�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Thread is Dead..");
	}
	
	public void stop() {
		stopped = true; 
		System.out.println("while�� Ż��");
	}
	
}




public class StopthreadTest {

	public static void main(String[] args) {
		// ���� �����带 ���۽�Ų ���� ������Ű�� �ʹٸ� ��� �ұ�? 
		// �ϴ� ù���� ����� �÷��׸� ����ϴ� ����̴�.
		System.out.println("���� �޼��� ����");
		StopthreadTest stt = new StopthreadTest();
		stt.process();
		
		
		System.out.println("main() ����");
		

	}
	
	public void process () {
		// stopThread �ν��Ͻ��� ������ �� �� ���ڸ� �Ķ���ͷ� �޴� 
		// ������ �ν��Ͻ��� ������ �Ŀ� ��߽�Ų��. 
		StopThread st = new StopThread();
		Thread thread = new Thread(st);
		thread.start();
		
		
		String name = Thread.currentThread().getName(); // ������ �̸� ���
		System.out.println("���� ������ �̸� = " + name);
		
	
		try {
			String name1 = Thread.currentThread().getName(); // ������ �̸� ���
			System.out.println("���� �� ���� ������ �̸� = " + name1);
		
			Thread.sleep(10000); // main() �����常 �ܴ�.
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		st.stop();
	}

	 // ���� ���� ������� Ư�� ������ ���ٸ� �׻� main() �Լ��� ������ �ൿ�Ѵ�.
	
	
	
	
	
	

}
