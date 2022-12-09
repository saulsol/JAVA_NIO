package firstJavaPrograming.IO;
import java.io.*;
import java.util.Properties;

public class Test09_propertiesExam {

	public static void main(String[] args) {
		//프로퍼티의 값을 읽어올 수도 있지만 반대로 프로그램에서 key = value 형식으로 기술되는 프로퍼티 파일을 생성할 수도 있다.
		
		try(Writer writer = new FileWriter("car.properties")){ // car.properties 파일로 출력받기 위한 출력스트림을 생성한다. 
			
			Properties car = new Properties();
			car.setProperty("model", "X5");
			car.setProperty("engine", "2000");
			car.setProperty("fuel", "3.3");
			
			car.store(writer, "car information"); // Properties 객체 car가 가지고 있는 목록을 저장합니다. 저장하는 출력위치는 첫 번째 인자값 writer이고, 
													// 두 번째 인자 "car information" 는 프로퍼티 파일의 주석문이다. 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
