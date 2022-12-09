package 자바NIO네트워크프로그래밍.chapter03;
import java.io.*;
public class BufferedReaderTest {

	public static void main(String[] args) {
		// 간단한 에코 프로그램을 만들어 볼것이다. 
		
		InputStream is = System.in; // 키보드 객체 생성
		InputStreamReader isr = new InputStreamReader(is); // char 타입으로 변환 시켜준다 
		 // 한줄로 펴하게 읽는 클래스 확인해보기 
		BufferedReader bfr = new BufferedReader(isr); // 한줄로 읽을 수 있는 유일한 메서드 제공 readLine() 메소드 제공
		String s = "입력하세요";
		 try {
			 System.out.println(s);
			 while(s != null) {
				  s = bfr.readLine();
				 System.out.println(s);
			 }
			System.out.println("종료합니다"); 
		} catch (IOException e) {
			
		}
		
		
		
		
		
		

	}

}
