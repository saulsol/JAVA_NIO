package �ڹ�NIO��Ʈ��ũ���α׷���.chapter02;

public class ThreadGroupTest {

	public static void main(String[] args) {
		// p.59
		
		System.out.println("ThreadGroupTest : " + Thread.currentThread()); // main() �Լ��� �켱������ �׻� 5�̴�
		
		ThreadGroup tGroup1 = new ThreadGroup(Thread.currentThread().getThreadGroup(), "ThreadGroup1");
		// main() ������ �׷��� ���� �׷��� �������
		ThreadGroup tGroup2 = new ThreadGroup("ThreadGroup2");
		// main ������ �׷��� ���� �׷��� �����
		ThreadGroup tGroup3 = new ThreadGroup(tGroup1 ,"ThreadGroup3");
		// tGroup1 ������ �׷��� ���� �׷��� �������
		
		Thread t1 = new Thread(tGroup1, "Thread-1");
		Thread t2 = new Thread(tGroup2, "Thread-2");
		Thread t3 = new Thread(tGroup3, "Thread-3");
		
		
		System.out.println(" t1: " + t1);
		System.out.println(" t2: " + t2);
		System.out.println(" t3: " + t3);
		
		System.out.println("main ������ �׷� : "
				+ Thread.currentThread().getThreadGroup()+"\n"
				+ "Ȱ������ ������ ���� : "
				+ Thread.currentThread().getThreadGroup().activeCount()+"\n"
				+ "Ȱ������ ������ �׷� ���� : "
				+ Thread.currentThread().getThreadGroup().activeGroupCount()+"\n"
				// main ������ �׷��� ����� ����Ѵ�
				);
		
		Thread.currentThread().getThreadGroup().list();
		
		

	}

}
