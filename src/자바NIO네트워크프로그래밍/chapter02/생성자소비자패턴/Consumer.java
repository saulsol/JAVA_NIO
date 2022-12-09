package �ڹ�NIO��Ʈ��ũ���α׷���.chapter02.�����ڼҺ�������;

public class Consumer implements Runnable {

	private SolQueue queue = null;
	private String name = null;
	
	public Consumer(SolQueue queue , String index ) {
		this.queue = queue;
		this.name = "Consumer - " + index;
	}
	
	
	@Override
	public void run() {
		System.out.println("[Start]" + name + ".." );
		try {			

			while(!Thread.currentThread().isInterrupted()) {
				System.out.println(name + " : " + queue.pop().toString());

			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("[ End " + name + "..]");
		}

	}

}
