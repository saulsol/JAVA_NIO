package �ڹ�NIO��Ʈ��ũ���α׷���.chapter02;

class AdvancedStopthread implements Runnable { 
	//�����带 ���ߴ� �ι� ° ����� interrupt() �޼ҵ带 ����ϴ� ����̴�. 
	// interrupt() �޼ҵ�� ���� �����ϰ� �ִ� ����� �ٷ� ������Ų��.

	public void run() {
		try {
			while(!Thread.currentThread().isInterrupted()) { // isInterrupted() �޼ҵ�� true �� false �� �����Ѵ�. 
				System.out.println("Thread is alive..");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
				
		}finally {
			
			System.out.println("Thread is dead..");
		}
		
	}//run


}

	


public class AdvancedStopThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdvancedStopThreadTest astt = new AdvancedStopThreadTest();
		astt.process();
		
	}
	
	public void process() {
		AdvancedStopthread ast = new AdvancedStopthread();
		Thread thread = new Thread(ast);
		thread.start();
		
		try {
			
			Thread.sleep(10000); // ����� ����� �޼ҵ带 ����. 
			
		}catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		thread.interrupt();
		
	}
	
	
	
	
	
	

}
