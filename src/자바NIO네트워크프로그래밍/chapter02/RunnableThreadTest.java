package �ڹ�NIO��Ʈ��ũ���α׷���.chapter02;

public class RunnableThreadTest implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Runnable �������̽��� ����");
	}

	public static void main(String[] args) {
		// ������ ������ �Ǵٸ� ����� Runnable �������̽��� �����ϴ� Ŭ������ ����� ���ο� Thread Ŭ������ ������ �� �ռ� ������ Ŭ������ �Ķ���ͷ� �ѱ�� ����̴�. 
		// ��ü �ռ��̶�� �� �� �ִ�.
		
		// Thread �����ڿ� RunnableThread �������̽��� �Ķ���ͷ� �����Ѵ�. 
		// ��ü �ռ�
		
		Thread t = new Thread(new RunnableThreadTest()); // �Ķ���ͷ� ��ü�� �־��� �� ��ü �ռ��̶�� �Ѵ�.
		
		t.start();
		

	

	
	}

}
