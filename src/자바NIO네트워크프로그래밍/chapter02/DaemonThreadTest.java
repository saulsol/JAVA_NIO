package �ڹ�NIO��Ʈ��ũ���α׷���.chapter02;

public class DaemonThreadTest { // �����ϵ��� ����(�Ǹ�)�� �ϰ� ������ �ʴ� ������ �Ѵ�.
								// �� �� �׶��� �������� ���̴�. 

	public static void main(String[] args) {
		// �ڹ����α׷����� �ϸ鼭 ��׶��� �۾��� �� ���� ���� �ִµ� 
		// JVM���� ������ �÷��� ���� �۾��� ��ǥ���� ����. 
		// �ڹٿ����� �̷� ��׶��� ���񽺸� ���� ���� �������� ������ �����ߴ�. 
		
		Thread t = new Thread() {
			public void run() {
				try {
					Thread.sleep(5000);
					System.out.println("Mythread ����");
				} catch (InterruptedException e) {
					// TODO: handle exception
				}
			}
		} ;
		
	t.setDaemon(true); // ���� ������� ����
	t.start();
		
	System.out.println("main() ����");
	}

}
