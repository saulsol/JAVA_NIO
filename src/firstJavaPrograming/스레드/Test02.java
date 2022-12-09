package firstJavaPrograming.스레드;

public class Test02 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Movie());
		
//		Thread t2 = new Thread(()->{
//			for(int i=0;i<=100;i++)
//				System.out.println("전화받기 : "+i);
//		}); //람다 식
//		
		
		t1.start();
		for(int i=0; i<=100; i++)
			System.out.println("main 전화받기 : "+ i);
		
	}

}

class Movie implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=100;i++)
			System.out.println("영화보기 : "+ i);
		
	}
	
}