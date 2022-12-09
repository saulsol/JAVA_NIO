package firstJavaPrograming.IO;
import java.io.*;
public class Test04Re {

	public static void main(String[] args) {
		// Test04 를 조금더 알차게 만들어보자. 
		
		// 1. 먼저 바이트 데이터를 담을 수 있는 바이트 배열이 필요하다. 
		byte[] arr = null;
		
		// 들어오는 통로랑 나가는 통로를 만들어야 한다.
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:\\Users\\82103\\eclipse-workspace\\자바 NIO\\src\\firstJavaPrograming\\IO\\a.txt"));
				ByteArrayOutputStream out = new ByteArrayOutputStream();){
			// 스트림으로부터 바로 받을 수 있는 배열이 필요하다
			byte[] buf = new byte[1024];
			int len = 0;
			
			while((len = in.read(buf)) != -1) {
				// 베열에 담긴 데이터의 수 만큼 출력해야한다. 
				out.write(buf, 0, len);
			}
			
			arr = out.toByteArray();
			String s = new String(arr);
			System.out.println(s);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// 바이트 배열에서의 write, read 전부 쓰임세가 조금씩 다르니 생각하면서 사용하자
		
		
		try(BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("C:\\Users\\82103\\eclipse-workspace\\자바 NIO\\src\\firstJavaPrograming\\IO\\c.txt"))) {
			bo.write(arr);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		

	}

}
