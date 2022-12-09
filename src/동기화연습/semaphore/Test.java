package ����ȭ����.semaphore;
import java.util.concurrent.Semaphore;
import java.io.IOException;

class BankAccount{
	Semaphore sem ;
	int balance = 0; // �ܵ� 
	
	public BankAccount() {
		this.sem = new Semaphore(1); // �Ӱ迵������ �� �� �ִ� ���μ����� ������ 1����
		// �� ������ 0�̸� ���� ���� �ִٴ� ���̴�. 
		// �Ӱ� ������ �����ִ� ���ȿ��� ���Ʊ�ȯ�� �� �� �ִ�. -1 �� �Ǵ� ���� ���ŷ�� �ȴ�. 
	}
	

	public void deposit(int a) {
		try {
			sem.acquire(); // �������� �Ű������� �� 1�� -- �ؼ� 0���� �����. �� �̹� �Ӱ豸���� ����ϰ� �ִ� �̷� ��  
		} catch (InterruptedException e) {}
		////////////////////////////////////////////
		int temp = balance + a;
		balance = temp;
		///////////////////////////////////////////
		sem.release(); // �Ӱ豸���� �� ���� ������ �� �� �Ű������� �����ص� 1���� ���� ���� 
	} 

	public void withdraw(int a) {
		try {
			sem.acquire();
		} catch (InterruptedException e) {}
		////////////////////////////////////////////
		int temp = balance - a;
		balance = temp;
		///////////////////////////////////////////
		sem.release();
	} 

	
	
	
	
	public int getBalance() {
		
		return balance;
		
	} 

}

class Parent extends Thread {

	BankAccount b;
	public Parent (BankAccount b) {
		this.b = b;
	}
	
	public void run() {
		try {
			sleep(100);
		} catch (InterruptedException e) {}
		
		for(int i=0; i<100000; i++ ) {
			System.out.println("+");
			b.deposit(1000);
		}
		System.out.println();
	}
	
}



class Child extends Thread {
	
	BankAccount b;
	public Child (BankAccount b) {
		this.b = b;
	}
	
	public void run() {
			
		for(int i=0; i<100000; i++ ) {
			System.out.println("-");
			b.withdraw(1000);
		}
		System.out.println();
	}
	
}



public class Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BankAccount b = new BankAccount();
		Parent p = new Parent(b);
		Child c = new Child(b); 
		
		p.start();
		c.start();
		p.join();
		c.join();
	
		System.out.println(b.getBalance());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
