package �ڹ�NIO��Ʈ��ũ���α׷���.chapter02.�����ڼҺ�������;
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
			synchronized (JobQueue.class) { // jobQueue Ŭ������ ����ͷ� ����ϰڴ�
				incetance = new JobQueue();
			}
		}
		return incetance;
	}
	
	
	@Override
	public void put(Object o) {
		synchronized(moniter) {
			jobs.addLast(o);
			moniter.notify(); // ������� ������ �ִٸ� �����
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
