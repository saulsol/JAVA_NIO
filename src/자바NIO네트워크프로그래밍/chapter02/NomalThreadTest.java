package �ڹ�NIO��Ʈ��ũ���α׷���.chapter02;

public class NomalThreadTest {

	public static void main(String[] args) {

		Thread t = new Thread() {
			public void run() {
				try {
					Thread.sleep(5000);
					System.out.println("My Thread ����");
					
				} catch (Exception e) {
					
				}
			}
			
		};
		
		t.start();
		
		
		System.out.println("main() �޼��� ����");
		
	}

}
// �ڹٿ����� ���ø����̼� ������ ��� �����尡 ������� ������ JVM�� ������� �ʴ´�. 