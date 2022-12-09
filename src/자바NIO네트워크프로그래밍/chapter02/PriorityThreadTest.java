package �ڹ�NIO��Ʈ��ũ���α׷���.chapter02;

class PriorityThread implements Runnable{
	
	// isInterrupted () �޼ҵ带 while�� �������� ����Ѵ�.
	// ����, �� �����忡�� interrupt() �޼ҵ带 ȣ���ϸ� 
	// isInterrupted() �޼ҵ�� true�� �����ؼ� while���� ���������� �ȴ�

	@Override
	public void run() {
		try {
			
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("Priority : " + Thread.currentThread().getPriority());
				System.out.println("MyThread ����");
				Thread.sleep(500);
			}
			
		}catch (InterruptedException e) {
			
		}
		
		System.out.println("MyThread ��");		
	}
	
}





public class PriorityThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread(new PriorityThread());
		t.start();
		System.out.println("���� ����");
		Thread.sleep(500);
		
		System.out.println("���� ����");
		t.setPriority(Thread.MIN_PRIORITY);
		System.out.println("���� ����");
		Thread.sleep(500);
		
		System.out.println("���� ����");
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println("���� ����");
		Thread.sleep(500);
		
		System.out.println("���� ����");
		t.setPriority(8);
		

		t.interrupt();
		System.out.println("���� �Լ� ��");
		

	}

}
