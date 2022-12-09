package firstJavaPrograming.스레드;

public class Test07 {

	public static void main(String[] args) {
		
		Phone calling = new Phone();
		calling.start();
		
		
		try {
			calling.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
		for(int i=0; i<=1000; i++ )
			System.out.println("음식 먹기 : " + i);
		

	}

}
