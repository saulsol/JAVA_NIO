package firstJavaPrograming.IO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03 {

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
			
			
			System.out.println("이름을 입력하세요");
			String name = br.readLine();
			System.out.println("hello" + name);

		}catch (IOException e) {
			
		}


	}

}
