package 자바NIO네트워크프로그래밍.chapter02.생성자소비자패턴;

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
