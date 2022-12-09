package �ڹ�NIO��Ʈ��ũ���α׷���.chapter02.�����ڼҺ�������;

public class Producer implements Runnable {
	
	private SolQueue queue = null;
	
	Producer(SolQueue queue){
		this.queue = queue;
	}

	@Override
	public void run() {
		System.out.println("[Start Producer]");
		
		try {
			
			int i = 0;
			while(!Thread.currentThread().isInterrupted()) {
				queue.put(Integer.toString(i++));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("End Producer...");
		}
		
	}

}
