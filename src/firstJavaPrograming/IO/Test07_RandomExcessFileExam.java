package firstJavaPrograming.IO;
import java.io.File;
import java.io.RandomAccessFile;

public class Test07_RandomExcessFileExam {

	public static void main(String[] args) {
		// 파일의 내용을 읽거나 쓰기 작업을 할 때는 파일의 처음부터 순서대로 읽기, 쓰기 작업을 해야한다. 
		// 만액 파일의 일부분만 변경하거나 읽어올 때는 불필요한 부분을 건너뛰는 작업을 해야 하기 때문에 비효율적입니다. 
		// 이런 문제점을 해결하는 객체가 java.io.RandomAccessFile 입니다.

		File f = new File("a.txt");

		try (RandomAccessFile raf = new RandomAccessFile(f, "rw")){ //"rw" ---> read write 
			// a.txt 파일에 대한 비 순차적인 접근을 하기위해 rw(읽기, 쓰기) 모드로 RandomAcessFile raf를 생성한다. 
			raf.seek(1); //파일 포인터의 위치를 1바이트 이동한다. 현위치 e
			byte b = raf.readByte(); // 현재 파일 포인터가 위치한 곳에서 1바이트를 읽어 변수 b에 저장한다. // 읽어들이면서 다음 글자로 넘어간다.  
			System.out.println((char)b);

			byte[] arr = new byte[4]; // 아까 e에서 읽었기 때문에 지금 위치는 n
			raf.read(arr); // 배열의 수 만큼 읽고 배열에 저장 
			System.out.println(new String(arr));

			raf.seek(2); // seek() 메서드를 이용할떄 그냥 숫자만 입력하면 가장 파일 포인터는 가장 첫번째 부터 이동한다. 현위치 n	
			raf.write("good".getBytes()); // 파일 포인터의 위치에 "good" 문자열을 바이트 배열로 변환하여 (getBytes()) 출력합니다 
			
			// getBytes ---> "good" 리터럴을 바이트 배열로 변환시켜준다 
			// write( ) 메서드는 바이트 배열을 받아서 출력한다. 따라서 리터럴을 바로 사용할 때 getBytes() 메서드를 사용하는 것이다. 
 
		} catch (Exception e) {

		}

	}

}
