package 자바NIO네트워크프로그래밍.chapter04;
import java.io.*;


public class FileDelete {

	public static void main(String[] args) {
		// 삭제되는 파일 만들기 
		
		File f = new File("C:\\Users\\82103\\eclipse-workspace\\자바 NIO\\bin\\자바NIO네트워크프로그래밍\\chapter04\\FileInfo.class");
		
		if(f.exists()) {
			boolean deleteFlag = f.delete();
			if(deleteFlag) 
				System.out.println("파일 삭제를 성공하였습니다");
			else 
				System.out.println("파일 삭제를 실패했습니다");	
		}else {
			System.out.println("파일이 존재하지 않습니다");
		}
		
		// 실제로 들어가서 보면 파일이 삭제된 것을 볼 수 있다. 
		
		// delete() 메소드는 파일을 성공적으로 삭제했을 경우 true 값을 반환한다. 
		

	}

}
