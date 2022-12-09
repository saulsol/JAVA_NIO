package 자바NIO네트워크프로그래밍.chapter02.생성자소비자패턴;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class JobQueue implements SolQueue {

	private static final String NAME = "JOB QUEUE";
	private static final Object moniter = new Object();
	
	private LinkedList jobs = new LinkedList(); 
	
	private static JobQueue incetance = new JobQueue();
	private JobQueue() {}

	public static JobQueue getIncetance() {
		if(incetance == null) {
			synchronized (JobQueue.class) { // jobQueue 클래스를 모니터로 사용하겠다
				incetance = new JobQueue();
			}
		}
		return incetance;
	}
	
	
	@Override
	public void put(Object o) {
		synchronized(moniter) {
			jobs.addLast(o);
			moniter.notify(); // 대기중인 스레드 있다면 깨운다
		}
		
	}

	@Override
	public Object pop() throws InterruptedException, NoSuchElementException {
		
		Object o = null;
		synchronized (moniter) {
			if(jobs.isEmpty())
				moniter.wait();
			o = jobs.removeFirst();
		}
		
		if(o == null) throw new NoSuchElementException();
		return o;

	}

	@Override
	public void clear() {
		synchronized (moniter){
			jobs.clear();
		}
		
		
	}

}
