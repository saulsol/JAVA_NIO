package 자바NIO네트워크프로그래밍.chapter02.생성자소비자패턴;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		// 큐를 생성한다.
		
		SolQueue queue = JobQueue.getIncetance();
		
		// 소비자를 생성하고 실행한다.
		Thread con1 = new Thread(new Consumer(queue, "1"));
		Thread con2 = new Thread(new Consumer(queue, "2"));
		Thread con3 = new Thread(new Consumer(queue, "3"));
		
		con1.start();
		con2.start();
		con3.start();
		
		// 생성자를 생성하고 시작한다. 
		
		Thread pro = new Thread(new Producer(queue));
		pro.start();
		
		Thread.sleep(500);
		
		pro.interrupt();
		
		con1.interrupt();
		con2.interrupt();
		con3.interrupt();

		
		

	}

}
