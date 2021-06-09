package chapters15;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferEx {

	public static void main(String[] args) throws IOException{
		FileReader fin = null;
		fin = new FileReader("C:\\Users\\ITPS\\git\\Java-web\\web\\src\\chapters15\\hangul.txt");
		BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
		int input;
		while((input = fin.read()) != -1){
			out.write(input);
		}
		new Scanner(System.in).nextLine();
		out.flush();
		fin.close();
		out.close();
	}

}
