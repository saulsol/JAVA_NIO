package firstJavaPrograming.������;

public class Test05 {

	public static void main(String[] args) {
		// �ΰ��� �����尡 ���ÿ� �ϳ��� �ڿ��� �����ϴµ� ����ȭ ó���� ���� �ʾ� �߸��� ����� �߻��ϴ� ������. 
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




class DrawThread extends Thread { // ������μ� �ӹ��� �� �� �ִ� Ŭ����
	
	Account account;
	
	public DrawThread(Account account) {
		this.account = account;
	}
	
	public void run() {

		//synchronized(account) { // ��� ����ȭ

			for(int i=0; i<10; i++) {
				account.draw(10);
				System.out.println(this.getName() + " ��� �� �ܾ� " + account.getBalance() );
			}
		//}
	}

	
	
}


