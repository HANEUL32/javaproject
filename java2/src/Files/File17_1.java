package Files;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//이미지 용량제한 체크 프로세서 만들기
/*
 이미지 업로드 할 수 있는 최대 용량은 1MB 이하 입니다.
 1MB 이상 파일을 업로드시 "이미지 제한 용량은 1MB 이하 까지 입니다."라는
 메세지를 출력 단 정상적인 1MB 이하면 e:memo에 이미지 복사되도록 함.
 
 buffer 쓰면 readLine 쓸 수 있다. (buffer만 가능)
 */

public class File17_1 {

	public static void main(String[] args) {
		try {
		//String file = "E:\\memo\\abc.jpg"; //1MB 이하
		String file = "E:\\memo\\a1.jpg"; //사용자가 업로드할 이미지 파일(1MB 이상)
		InputStream is = new FileInputStream(file);
		
		int imgs = 0;
		int check = 0;
		if(is.available() > 1048576) {
			System.out.println("이미지 제한 용량은 1MB 이하 까지 입니다.");
		}
		else {
			BufferedInputStream bs = new BufferedInputStream(is);	
			byte [] filesize = new byte[bs.available()];
			int total = bs.read(filesize);
			
			OutputStream os = new FileOutputStream("e:\\memo\\a2.jpg");
			os.write(filesize,0,total);
			os.close();
			System.out.println("이미지가 등록 되었습니다.");
		}
	}

		catch (Exception e) {
			
		}
	}

}
