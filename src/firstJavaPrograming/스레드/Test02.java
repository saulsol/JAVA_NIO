package firstJavaPrograming.������;

public class Test02 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Movie());
		
//		Thread t2 = new Thread(()->{
//			for(int i=0;i<=100;i++)
//				System.out.println("��ȭ�ޱ� : "+i);
//		}); //���� ��
//		
		
		t1.start();
		for(int i=0; i<=100; i++)
			System.out.println("main ��ȭ�ޱ� : "+ i);
		
	}

}

class Movie implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=100;i++)
			System.out.println("��ȭ���� : "+ i);
		
	}
	
}