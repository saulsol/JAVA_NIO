package firstJavaPrograming.IO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test06_2 {

	public static void main(String[] args) {

		try {
			// 파일 읽기
			Path input = Paths.get("a.txt"); // c 드라이브부터 경로를 지정하는 방식은 절대 경로를 지정하는 방식이다. 
											// 그리고 드라이브 이름부터 시작하지 않고 바로 a.txt 파일명이 나오는 것은 상대경로 입니다.
											// 이클립스에서 파일명만 입력하면 프로젝트와 같은 위치를 의미합니다
			
			byte [] bytes = Files.readAllBytes(input); // Files.readAllBytes() 메서드는 인자로 전달한 Path의 모든 내용을 바이트 배열로 전달한다.
														// bytes 배열에는 a.txt 파일의 내용이 저장됩니다. 
			System.out.println("== readAllBytes ==");
			System.out.println(new String(bytes)); // 바이트 배열을 String 문자열로 변환 String 생성자의 역할 
			
			System.out.println("\n == readAllLines == ");
			List<String> lines = Files.readAllLines(input); // 메서드 인자로 전달한 Path의 모든 내용을 문자열로 읽어들인다.
															// 줄단위 문다열로 처리하여 List에 저장합니다.
			for(String line : lines ) {
				System.out.println(line);
			}
			
			System.out.println("-------------출력완료-------------");
			
			// 파일 쓰기
			Path out1 = Paths.get("C:\\Users\\82103\\eclipse-workspace\\자바 NIO\\src\\firstJavaPrograming\\IO\\c.txt");
			Files.write(out1, bytes); // 인자로 받은 파일에다가 바이트 배열의 내용을 출력
			
			Path out2 = Paths.get("C:\\Users\\82103\\eclipse-workspace\\자바 NIO\\src\\firstJavaPrograming\\IO\\d.txt");
			Files.write(out2, lines); // 인자로 받은 파일에 연결 리스트의 내용을 출력
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		

	}

}
