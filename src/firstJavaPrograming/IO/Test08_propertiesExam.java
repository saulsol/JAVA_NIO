package firstJavaPrograming.IO;
import java.io.*;
import java.util.Properties;

public class Test08_propertiesExam {
	// 프로그램을 구현할 때 값을 설정해야 하는 때가 많다. 예를들어 아이디, 비밀번호와 같은 값들이다. 
	// 아이디와 비밀번호를 이용하여 어떤 기능을 처리할 때 프로그램 내에서 각각의 값을 직접 지정하면 나중에 값이 변경될 때 프로그램을 수정해야 하는 일이 발생한다.
	// 따라서 변경될 가능성이 있는 값들은 외부파일에 저장해 두고 프로그램에서 읽어와 사용한다. 그러면 프로그램 변경 없이 외부 파일만 변경해서 간단하게 사용할 수 있다.
	// 이처럼 프로그램에서 사용할 값을 저장할 목적으로 만드는 파일을 "프로퍼티(properties) 파일이라고 한다."
	// properties 파일은 "key=value" 형식으로 기술되며 주석을 선언할 때는 # 기호를 사용한다. 
	
	public static void main(String[] args) {
		
			// 입력스트림 생성
		try (Reader reader = new FileReader("C:\\Users\\82103\\eclipse-workspace\\자바 NIO\\src\\firstJavaPrograming\\IO\\user.properties")){
			 
			// 내용담을 객체 만들기 (프로퍼티 파일의 내용을 담을 객체 만들기) 
			Properties user = new Properties();
			user.load(reader);
			// .load() 메서드는 인자로 전달한 입력스트림의 프로퍼티 파일로부터 key = value의 목록을 읽어옵니다.
			
			
			
			System.out.println(user.getProperty("id"));
			System.out.println(user.getProperty("name"));
			System.out.println(user.getProperty("password"));
			// .getProperties() 해당하는 Key 값의 value 값을 반환한다. 
			
			
		} catch (Exception e) {
			
		}
		
		
		
		
		
		
		
	}
	
	

}
