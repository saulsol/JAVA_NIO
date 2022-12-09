package firstJavaPrograming.IO;
import java.io.*;
public class Test02 {

	public static void main(String[] args) {
		

		try( InputStream keyboard = System.in;
			PrintStream console = System.out;)  // try 블록이 끝나면 자동 자원 해제
		{
			int c = 0;
			while((c = keyboard.read()) != -1) {
				console.write(c);
			}
			
		} catch (IOException e) {
			System.out.println("스트림 문제가 발생하였습니다");
		}
		
		// .read() 메서드는 ctrl + z 를 하면 자동종료 이다. 

	}

}
