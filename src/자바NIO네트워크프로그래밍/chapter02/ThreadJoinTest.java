package �ڹ�NIO��Ʈ��ũ���α׷���.chapter02;

public class ThreadJoinTest {

	public static void main(String[] args) {
		
		Thread t = new Thread() {			
			public void run() {
				try {
					Thread.sleep(2000);
					System.out.println("MyThread ����");
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
				}
				
				
			}
			
		};
		
		t.start();
		try {
			t.join(); // t �����尡 ����� �� ���� main() �޼��尡 ��ٸ���. 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main() �޼��� ����");
		
	}
	
	
	

}
