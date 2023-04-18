package Files;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class File7_2 {

	public static void main(String[] args) {
		database mdb = new database();
		try {
		mdb.db();
		}
		catch(Exception e) {
			System.out.println("메소드 접속 오류");
		}
	}
}

class database{
	FileReader fr = null;
	Scanner sc = null;
	ArrayList<String[]> ln = null; //빈 2차배열
	String data[] = null; //1차 배열 (원시배열)
	
	//경로(웹) - Servlet,Spring Java \ 경로
	public void db() throws Exception{
		this.fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\member.txt");
		this.sc = new Scanner(this.fr);
		this.ln = new ArrayList<>();
		while(this.sc.hasNext()) {
			//split으로 구분하여 1차 배열로 이관
			this.data = this.sc.nextLine().split(",");
			this.ln.add(this.data); //1차배열값을 2차배열로 이관
		}
		//System.out.println(Arrays.toString(this.ln.get(0)));
		//System.out.println(Arrays.toString(this.ln.get(1)));
		
		//2차배열 이상 출력시 deeptoString 및 toArray 메소드를 사용하면 정확한
		//배열값을 확인 할 수 있습니다.
		System.out.println(Arrays.deepToString(this.ln.toArray()));
		this.sc.close();
		this.fr.close();
	}
}
