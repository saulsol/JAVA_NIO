package �ڹ�NIO��Ʈ��ũ���α׷���.chapter02.�����ڼҺ�������;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		// ť�� �����Ѵ�.
		
		SolQueue queue = JobQueue.getIncetance();
		
		// �Һ��ڸ� �����ϰ� �����Ѵ�.
		Thread con1 = new Thread(new Consumer(queue, "1"));
		Thread con2 = new Thread(new Consumer(queue, "2"));
		Thread con3 = new Thread(new Consumer(queue, "3"));
		
		con1.start();
		con2.start();
		con3.start();
		
		// �����ڸ� �����ϰ� �����Ѵ�. 
		
		Thread pro = new Thread(new Producer(queue));
		pro.start();
		
		Thread.sleep(500);
		
		pro.interrupt();
		
		con1.interrupt();
		con2.interrupt();
		con3.interrupt();

		
		

	}

}
