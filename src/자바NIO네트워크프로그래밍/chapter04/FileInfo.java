package 자바NIO네트워크프로그래밍.chapter04;
import java.io.File;
import java.io.IOException;


public class FileInfo {

	public static void main(String[] args) {
		
		
		
		File f = new File("C:\\Users\\82103\\eclipse-workspace\\자바 NIO\\bin\\자바NIO네트워크프로그래밍\\chapter04\\FileInfo.class"); // 프로그램 알규먼트 
		if(f.exists()) {
			System.out.println("length : " + f.length()); // 파일의 크기 리턴
			System.out.println("canRead : "+ f.canRead()); // 파일을 읽을 수 있는지 권한 파악
			System.out.println("canWrite : " + f.canWrite()); // 그 파일에 어떤 것을 쓸 수 있을지 , 권한이 걸려져 있는 파일이면 쓰거나 읽지 못한다.
			System.out.println("getApsolutePath : " + f.getAbsolutePath()); // 그 파일의 절대경로를 리턴
			
			try {
				System.out.println("getCononicalPath :" + f.getCanonicalPath());
				
			} catch (IOException e) {
				System.out.println(e);
			}
			
			System.out.println("getName : " + f.getName());
			System.out.println("getParent : " + f.getParent());
			System.out.println("getPath : " + f.getPath()); // 파일의 경로를 문자열로 반환한다
			
		}else {
			System.out.println("파일이 존재하지 않습니다");
		}
		
		
		
		
		
		

	}

}
