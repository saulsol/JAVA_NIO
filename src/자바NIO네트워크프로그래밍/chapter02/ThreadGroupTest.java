package 자바NIO네트워크프로그래밍.chapter02;

public class ThreadGroupTest {

	public static void main(String[] args) {
		// p.59
		
		System.out.println("ThreadGroupTest : " + Thread.currentThread()); // main() 함수의 우선순위는 항상 5이다
		
		ThreadGroup tGroup1 = new ThreadGroup(Thread.currentThread().getThreadGroup(), "ThreadGroup1");
		// main() 스레드 그룹의 하위 그룹을 만들었다
		ThreadGroup tGroup2 = new ThreadGroup("ThreadGroup2");
		// main 스레드 그룹의 하위 그룹을 만든다
		ThreadGroup tGroup3 = new ThreadGroup(tGroup1 ,"ThreadGroup3");
		// tGroup1 스레드 그룹의 하위 그룹을 만들었다
		
		Thread t1 = new Thread(tGroup1, "Thread-1");
		Thread t2 = new Thread(tGroup2, "Thread-2");
		Thread t3 = new Thread(tGroup3, "Thread-3");
		
		
		System.out.println(" t1: " + t1);
		System.out.println(" t2: " + t2);
		System.out.println(" t3: " + t3);
		
		System.out.println("main 스레드 그룹 : "
				+ Thread.currentThread().getThreadGroup()+"\n"
				+ "활동중인 스레드 개수 : "
				+ Thread.currentThread().getThreadGroup().activeCount()+"\n"
				+ "활동중인 스레드 그룹 개수 : "
				+ Thread.currentThread().getThreadGroup().activeGroupCount()+"\n"
				// main 스레드 그룹의 목록을 출력한다
				);
		
		Thread.currentThread().getThreadGroup().list();
		
		

	}

}
