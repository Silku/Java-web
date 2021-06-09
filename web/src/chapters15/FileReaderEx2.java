package chapters15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileReaderEx2 {

	public static void main(String[] args) throws IOException {
		InputStreamReader in = null;
		FileInputStream fin = null;
		int input;
		
			fin = new FileInputStream("C:\\Users\\ITPS\\git\\Java-web\\web\\src\\chapters15\\hangul.txt");
			in = new InputStreamReader(fin, "UTF-8");
			
			BufferedReader rin = new BufferedReader(in);
			
			System.out.println("인코딩 문자집합은 " + in.getEncoding());
			while((input = rin.read()) != -1) {
				System.out.print((char)input);
		}
			in.close();
			fin.close();
		
			Scanner sc = new Scanner(System.in);
			FileWriter fout = null;
			int output;
			fout = new FileWriter("C:\\Users\\ITPS\\git\\Java-web\\web\\src\\chapters15\\hangul.txt");
			while(true) {
					String line = sc.nextLine();
					if(line.length()==0) {
						break;
					}
					fout.write(line, 0, line.length());
					fout.write("\r\n", 0, 2);
			}
			fout.close();
			sc.close();
}
}
