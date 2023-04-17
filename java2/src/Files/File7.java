package Files;
//다시 풀기~
import java.io.FileReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class File7 {

	public static void main(String[] args) {
		na1 n = new na1();
		try {
			n.view();
		}
		catch(Exception e) {
			System.out.println("오류발생");
		}

	}

}
class na1{
	LinkedList<String> al;
	FileReader fr = null;
	Scanner sc = null;

	public void view() throws Exception{
		this.fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\member.txt");
		this.sc = new Scanner(this.fr);
		while(this.sc.hasNext()) {
			//System.out.println(this.sc.nextLine());
			   String[] data = this.sc.nextLine().split(" , ");
		         al = new LinkedList<>(Arrays.asList(data));
		         System.out.println(al);
		}
		this.fr.close();
		this.sc.close();
	}
}