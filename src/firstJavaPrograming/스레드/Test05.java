package firstJavaPrograming.스레드;

public class Test05 {

	public static void main(String[] args) {
		// 두개의 스레드가 동시에 하나의 자원에 접근하는데 동기화 처리가 되지 않아 잘못된 결과가 발생하는 예제다. 
		Account account = new Account();
		DrawThread t1 = new DrawThread(account); 
		DrawThread t2 = new DrawThread(account); 
		
		t1.start();
		t2.start();
		
	}

}

class Account{
	
	private long balance = 1000;
	
	public synchronized void draw(long amount) {
		balance -= amount; 
	}
	
	public long getBalance() {
		return balance; 
	}
}




class DrawThread extends Thread { // 스레드로서 임무를 할 수 있는 클래스
	
	Account account;
	
	public DrawThread(Account account) {
		this.account = account;
	}
	
	public void run() {

		//synchronized(account) { // 블록 동기화

			for(int i=0; i<10; i++) {
				account.draw(10);
				System.out.println(this.getName() + " 출금 후 잔액 " + account.getBalance() );
			}
		//}
	}

	
	
}


