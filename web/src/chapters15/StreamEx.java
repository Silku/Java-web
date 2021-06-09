package chapters15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class StreamEx {
	/**
	 * 스트림(Stream) 데이터의 흐름 
	 * in -> out 
	 * out -> in 
	 * in ex)키보드, 이미지, 파일, 사운드 
	 * out ex) 화면,스티커 
	 * 무조건 단 방향의 데이터 전송 전달 
	 * 스트림의 데이터 : 
	 * 1. 바이너리 데이터 
	 * 2. 문자 데이터 read(); 데이터의 개수(바이트수)
	 * 
	 * - 기타메모 
	 * .in 처럼 누우면 스태틱
	 * 
	 */

	public static void main(String[] args) throws IOException {
		InputStream i; // 이진처리 ,byte 단위
		OutputStream o; // 이진처리
		Reader r; // 문자처리 ,char 단위
		Writer w; // 문자처리

		InputStreamReader rd = new InputStreamReader(System.in);
		while (true) {
			int input = rd.read();
			if (input != 13 && input != 10) {
				System.out.println((char)input);
			}
		}
	}

}
