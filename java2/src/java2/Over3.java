package java2;

import java.util.Scanner;

public class Over3 {
	/*
	 응용문제4. 
	 각 통신사별 인원수 현황을 출력하는 프로세서를 개발하시오.
	 결과) 
	 SKT : 1명
	 KT : 2명
	 LGT : 1명
	 */

	public static void main(String[] args) {
		myin m = new myin();
		m.userlist(null);
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("통신사를 입력하세요:");
		String m1 = sc.next();
		*/
	}

}
class myin extends Over1{
	int ea;
	public void userlist(String username) {
		
		super.userlist(username);
		this.ea = this.list.length;
		int ww = 0;
		int scount = 0;
		int kcount = 0;
		int lcount = 0;
		while(ww < this.ea) {
			if(this.list[ww][4].equals("SKT")) {
				scount++;
			}
			else if(this.list[ww][4].equals("KT")) {
				kcount++;
			}
			else if(this.list[ww][4].equals("LGT")) {
				lcount++;
			}
			ww++;
		}
		System.out.printf("SKT : %d명\nKT : %d명\nLGT : %d명\n",scount,kcount,lcount);		
	}
}