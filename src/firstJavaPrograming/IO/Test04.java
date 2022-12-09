package firstJavaPrograming.IO;
import java.io.*;

public class Test04 {

	public static void main(String[] args) {
		// 필터 스트림 테스트
		
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:\\Users\\82103\\eclipse-workspace\\자바 NIO\\src\\firstJavaPrograming\\IO\\a.txt"));
			ByteArrayOutputStream out = new ByteArrayOutputStream();){

			byte[] buf = new byte [1024];
			int len = 0;
			while ((len = in.read(buf)) != -1) { // in.read(buf)는 in 입력 스트림에서 buf 배열 크기만큼 읽어들여 buf 배열에 저장한다.  
												// len 변수에는 in.read 메서드에서 읽어들인 전체 바이트 수 가 저장된다.  그러니까 배열에 저장된 바이트 수 만큼 읽는다고 
				
				out.write(buf, 0, len); // 바이트 배열과 연결된 ByteArrayOutputStream 은 wirte 메소드를 제공하여 데이터를 0번지 부터 len 번지 까지 출력한다. (근데 그냥 출력만하니 어디에 저장할껀데)
			}
			
			byte [] arr = out.toByteArray(); // out.toByteArray() 메서드는 out 바이트 배열 스트림으로 출력된 데이터를 byte 배열로 반환한다.  (여기에 저장한다.)
			
			
			String s = new String(arr); //!
			
			System.out.println(s);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		// ! 보통 파일의 내용을 읽거나 네트워크를 통해 받은 데이터는 보통 byte[] 배열이므로 이것을 문자열로 변환하기 위해 사용한다.
		// 자세한 원리는 모르지만 String s = new Sting (byte[] b) 이런식으로 String 생성자를 만들어 바이트 타입 배열로 받으면 
		// 자동으로 String 타입으로 변환해서 문자열로 만들어준다. 
		

	}

}
