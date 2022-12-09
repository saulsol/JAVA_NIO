package firstJavaPrograming.스레드;


class Work1 extends Thread{

	public Work1() {
		setName("파일 저장");
	}

	public void run() {
		for(int i=0;i<=10;i++)
			System.out.println( this.getName()+" 작업중...");
	}

}

              
class Work2 extends Thread{

	public Work2() {
		setName("서버연결");
	}

	public void run() {
		for(int i=0;i<=10;i++)
			System.out.println(this.getName()+"작업 중...");
	}



}



public abstract class Test03 {

	public static void main(String[] args) {


		Work1 w1 = new Work1();
		Work2 w2 = new Work2();

		w1.start();
		w2.start();	

	}

}
