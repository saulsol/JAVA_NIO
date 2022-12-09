package firstJavaPrograming.IO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {

	public static void main(String[] args) {
		// 스트림 객체는 일종의 통로다 그걸 읽어드리는 메소드가 필요하다. 

		try(FileInputStream fi= new FileInputStream("C:\\Users\\82103\\eclipse-workspace\\자바 NIO\\src\\firstJavaPrograming\\IO\\a.txt");
				FileOutputStream fo = new FileOutputStream("C:\\Users\\82103\\eclipse-workspace\\자바 NIO\\src\\firstJavaPrograming\\IO\\b.txt", true); // 주소 뒤에 true 표시를 해주면 출력 스트림을 연결한 리소스에 미리 저장된 내용 + 새로 받는 내용이 저장된다
				) { // try 블록이 끝나면 자동으로 자원 종료 해준다 스트림은 통로이기 때문에 연 다음에 닫는 행위를 해주는 것이 좋다. 
					// 정확한 주소를 알려주는 것이 좋다
			int c = 0;

			while((c = fi.read()) != -1) { // -1 이 아니면 계속 실행  -1 맞으면 탈출
				fo .write(c);
			}

		} catch (FileNotFoundException e) {
			System.out.println("그런 파일은 존재하지 않습니다");
			e.printStackTrace();

		}catch (IOException e) {
			System.out.println("스트림 과정중 문제가 발생했습니다");

		}

		System.out.println("파일 복사가 완료되었습니다 프로젝트를 새로고침 한 뒤 파일을 확인헤 보세용");


		// fi.read()는 fi 입력스트림에 연결된 a.txt 파일에서 1바이트를 읽어 정수로 반환한다. 'A'를 읽었다면 65로 리턴한다. 
		// fi.read() 메서드는 한번만 실행하면 한 글자만 읽어온다. 파일의 모든 문자를 읽어오려면 파일의 문자 수 만큼  fi.read () 메소드를 반복해야 한다. 
		// fi.read() 메소드는 더이상 읽을 글자가 없을경우 -1 을 리턴한다. 
	}

}
