package firstJavaPrograming.������;

class Food extends Thread {
	
	public void run() {
		for(int i=0;i<=1000;i++) 
			System.out.println("���� �Ա� : "+ i);
	}
	
}

class Phone extends Thread{
	
	public void run() {
		for(int i=0;i<=1000;i++)
			System.out.println("��ȭ �ޱ� : "+ i);
	}
}




public class Test01 {

	public static void main(String[] args) {
		
		Thread work1 = new Food();
		Thread work2 = new Phone();
		
		work1.start();
		work2.start();
		
		
		for(int i=0;i<=1000;i++)
			System.out.println("main TV ���� : "+ i);
		
		
		
	
	}


}
