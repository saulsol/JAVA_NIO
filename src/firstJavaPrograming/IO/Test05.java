package firstJavaPrograming.IO;
import java.io.File;
import java.io.PrintWriter;

public class Test05 {

	public static void main(String[] args) {
		// File 클래스 이용 방법
		
		try {
			
			File dir = new File("c:\\workSol");
			dir.mkdir(); // 디렉토리 생성
			
			File file = new File(dir, "sol.txt");// 해당 디렉토리에 해당 파일 만든다
			file.createNewFile();
			
			// 파일 또는 디렉토리 여부 판단
			if(dir.isDirectory())
				System.out.println(dir.getName()+"는 디렉터리입니다"); // 해당 디렉토리가 있을경우 true 리턴
			if(file.isFile())
				System.out.println(file.getName()+"는 파일입니다"); // 해당 객체가 파일인 경우 true 리터
			
			// 파일에 데이터 출력 후 읽기 
			if(file.exists()) {
				try (PrintWriter out = new PrintWriter(file)){ // 매개 변수로 받는 곳에 write 해라 
					out.println("Hello java!");	 //System.out.println() ---> 콘솔에다가 써라 System.out 이 콘솔으로 출력하는 출력스트림 이기 때문이다. 
				}
				System.out.println("파일 이름 : " + file.getName());
				System.out.println("파일 경로 : " + file.getPath());
				System.out.println("쓰기 가능 : " + file.canWrite());
				System.out.println("읽기 가능 : " + file.canRead());
				System.out.println("파일 길이 : " + file.length()+ "byte");
			}else {
				System.out.println("파일이 존재하지 않음");
			}
			
			File subDir = new File("c:\\workSol\\subdir");
			subDir.mkdir();
			
			File file2 = new File(subDir, "juju.txt");
			file2.createNewFile();
			
			// 파일 절대 경로
			String file2Path = file2.getAbsolutePath();
			System.out.println("절대경로 : " + file2Path );
			
			// 부모 디랙토리
			String parentDir = file2.getParent();
			System.out.println("부모 경로 : " + parentDir);
			
			// 디렉토리 목록 구하기
			File parentFile = file2.getParentFile(); // 현재 파일의 상위 경로를 가진 File 객체를 생성한다. 
			String [] fileNames = parentFile.list();  // File 객체가 가지고 있는 목록을 String 배열로 반환한다. 
														// 디렉토리라면 디렉토리에 저장된 파일들을 또는 하위 디렉토리의 이름을 추출합니다. 다양하게 쓰이니까 나중에 쓰임새를 알아보자
			System.out.print( parentDir + "목록 ===>");
			
			for(String name : fileNames ) {
				System.out.println(name);
			}
			
			
			
		} catch (Exception e) {
			System.out.println("디렉토리 또는 파일이 생성되지 않았습니다.");
		}
		
		
		
		
	}

}
