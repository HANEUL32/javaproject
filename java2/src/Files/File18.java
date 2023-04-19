package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
//Stream을 사용하고 나서 Buffered 사용 : read, write 단독으로 사용은 하지 않음

//read : int형태, readline : String형태

/*
 InputStream > InputStreamreader > BufferedReader (O)
 InputStream > BufferedInputStream (O)
 InputStream > BufferedReader (X)
 InputStreamreader > BufferedReader (O)
 
 BufferedReader - close() 메모리 종료
 Bufferedwriter - flush() 메모리 초기화 + close() 메모리 종료
 */
public class File18 {

	public static void main(String[] args) {
		try {
		/*
		OutputStreamWriter os = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(os);
		bw.write("홍길동");
		bw.close();
		*/
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String test = br.readLine();
		System.out.println(test);
		}
		
		/*
		 FileInputStream => BufferedInputStream
		 FileOutputStream => BufferedOutputStream
		 */
		catch (Exception e) {
			
		}
		
	}

}
