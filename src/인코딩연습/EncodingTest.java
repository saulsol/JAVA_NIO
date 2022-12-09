package 인코딩연습;
import java.util.Scanner;
public class EncodingTest {

	public static void main(String[] args) throws Exception {
		// 자바에서는 어디서 인코딩에 적용될까?
		// 바이트 데이터를 기준으로 문자를 만들어내는 모든 부분에서 적용된다. 즉 바이트로 변환하는 모든 경우가 인코딩이라고 할 수 있다.
		// String 클래스에는 바이트 배열을 어떤 인코딩 기법으로 해석하여 문자를 생성할 것인지 지정하는 생성자가 있다. 
		// 반대로 String 객체에서 어떤 인코딩 기법을 이용해 바이트 배열로 분해할지 지정하는 getBytes() 메서드도 존재한다.
		
		System.out.println("file.encoding="+System.getProperty("file.encoding"));
        System.out.println("임솔");
		
		String str = "오늘도 난 독서실에 왔다 프로그래밍이란 쉽지 않구나 ~ 뷁";
		
		byte defaultBytes[] = str.getBytes(); // 기본 인코딩

		for(byte s : defaultBytes) {
			System.out.print(s);
		}
		
		String s = new String(defaultBytes); // 바이트 배열을 String 생성자의 인자로 받아 바이트 배열을 디코딩 하는 코드
		System.out.println("\n"+s);
		
		
		byte eucBytes[] = str.getBytes("euc-kr"); // EUC-KR 인코딩
		byte ksc5601Bytes[] = str.getBytes("ksc5601"); // KSC5601 인코딩
		byte ms949Bytes[] = str.getBytes("ms949"); // MS949 인코딩
		byte unicodeBytes[] = str.getBytes("unicode"); // Unicode 인코딩
		byte utf8Bytes[] = str.getBytes("utf-8"); // UTF-8 인코딩
		byte utf16Bytes[] = str.getBytes("utf-16"); // UTF-16 인코딩
		
		System.out.println("EUC-KR 인코딩 : " + new String(eucBytes,"euc-kr"));
		System.out.println("KSC5601 인코딩 : " + new String(ksc5601Bytes, "ksc5601"));
		System.out.println("MS949 인코딩 :" + new String(ms949Bytes, "ms949"));
		System.out.println("Unicode 인코딩 : " + new String(unicodeBytes, "unicode"));
		System.out.println("UTF-8 인코딩 : " + new String(utf8Bytes, "utf-8"));
		System.out.println("UTF-16 인코딩 : " + new String(utf16Bytes, "utf-16"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
