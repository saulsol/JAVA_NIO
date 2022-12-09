package 자바NIO네트워크프로그래밍.chapter04;
import java.io.*;
public class FileList {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\82103\\eclipse-workspace\\자바 NIO\\bin\\자바NIO네트워크프로그래밍"); // 요번엔 파일명이 아니라 디렉토리를 주었다. 
		
		if(!f.exists()) {
			System.out.println("파일이 존재하지 않습니다");
			System.exit(0);
		}else if(f.exists()){
			
			File [] list = f.listFiles(); // listFiles() 메소드는 디렉토리 안에 있는 파일 목록을 File의 배열 형태로 반환한다. 
											// File 배열을 받아들인 후 for문을 이용해 
			
			for(int i=0; i<list.length; i++) {
				System.out.print(list[i].getName());
				System.out.print("\t");
				
				if(list[i].isDirectory()) //isDirectory() 메서드는 디렉터리인지 파일인지 여부판단을 해서 
					System.out.print("디렉토리\n"); // true dir 인 경우
				else {
					System.out.print("파일"); // false 파일인 경우
					System.out.print("\t");
					System.out.print(list[i].length()+"\n");
				}
					
			}
		}else {
			System.out.println("디렉터리가 아닙니다");
		}
	

	}

}
