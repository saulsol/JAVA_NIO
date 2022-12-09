package firstJavaPrograming.IO;
import java.io.PrintWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Test06_1 {

	public static void main(String[] args) {

		try {

			// 디렉터리 생성
			Path dir = Paths.get("c:", "workHARD","srbDir" );	
			Files.createDirectories(dir);

			System.out.println("실행완료1");

			// 파일생성
			Path file1 = Paths.get("c:\\workHARD\\file1.txt"); // 이미 있는 파일이면 실행되지 않음
			Files.createFile(file1);

			System.out.println("실행완료2");

			// 파일을 Path로 변환
			File f1 = new File("c:\\workHARD\\file1.txt");
			Path p1 = f1.toPath();

			System.out.println("실행완료3");


			// Path를 파일로 변환
			File f2 = file1.toFile();


			System.out.println("실행완료4");

			Path file2 = dir.resolve("c:\\workHARD\\file2.txt");
			Path normalPath = file2.normalize();
			Path root = file2.getRoot(); // root 경로 // 최상위 위치 

			Path parent = file2.getParent(); // parent 경로 // 상위 폴더
			System.out.println("Path normalize : " + normalPath);
			System.out.println("root 경로 : " + root);
			System.out.println("parent 경로 : " + parent);

			if(Files.exists(file1)) {
				System.out.println(file1 + "존재");
			}

			try {
				PrintWriter out = new PrintWriter(f2);
				out.println("hi JUJU");
			} catch (Exception e) {
				System.out.println("에외가 발생하였습니다");
			}
			
			Path file3 = dir.resolve("file3.txt");
			Files.copy(file1, file3); // 파일 복사





		} catch (Exception e) {
			System.out.println("에외가 발생하였습나다");
		}






	}

}
