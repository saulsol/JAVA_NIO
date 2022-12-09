package firstJavaPrograming.스레드;

public class Test04 {

	public static void main(String[] args) {
		
		Food f = new Food();
		Phone p = new Phone();
		
		
		f.setPriority(Thread.MAX_PRIORITY); // 음식 먹기가 먼저 끝남
		
		p.setPriority(Thread.MIN_PRIORITY);
		
		f.start();
		p.start();
		
		// 우선순위가 높을 수록 더 많은 작업시간을 할당받음  ---> CPU에게서
		
		
	}

}

