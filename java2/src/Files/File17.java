package Files;

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

public class File17 {

	public static void main(String[] args) {
		try {
		String file = "E:\\memo\\abc.jpg"; //1MB 이하
		//String file = "E:\\memo\\a1.jpg"; //사용자가 업로드할 이미지 파일(1MB 이상)
		InputStream is = new FileInputStream(file);

		int aa = is.available(); //메모리 크기
		int imgs = 0;
		int check = 0;
		if(aa > 1048576) {
			System.out.println("이미지 제한 용량은 1MB 이하 까지 입니다.");
		}
		else {
			
			byte img[] = new byte[is.available()/100];
			OutputStream os = new FileOutputStream("e:\\memo\\a2.jpg");
		
		while(true) {
			imgs = is.read(img);
			if(imgs == -1) {
				break;
			}
			else {
				os.write(img,0,imgs);
			}
			check++;
			if(check % 2 ==0) {
				System.out.println(check + "%");
			}
		}
	}
}
		catch (Exception e) {
			
		}
	}

}
