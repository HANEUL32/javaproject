package Files;

import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.Scanner;

//Scanner + FileReader 응용

public class File6 {

	public static void main(String[] args) {
		notice n = new notice();
		try {
		n.view(); //try안쓰면 오류난다.
		}
		catch(Exception e) {
			System.out.println("메소드 함수 오류");
		}
		
	}
}
class notice{
	FileReader fr = null;
	Scanner sc = null;
	public void view() throws Exception {	
		this.fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt",Charset.forName("UTF8"));
		//해당 Scanner에 파일 내용을 모두 적용시킴
		//System.in : 직접입력, System.out : 출력파트
		this.sc = new Scanner(this.fr);
		
		while(this.sc.hasNext()) { //파일에 사용된 라인갯수 만큼 반복
		System.out.println(this.sc.nextLine()); //띄어쓰기 때문에 nextLine 사용
		//nextLine() : 단어 띄어쓰기로 인하여 데이터가 짤리는 현상 막음
		}
		this.fr.close();
		this.sc.close();
	}
}
