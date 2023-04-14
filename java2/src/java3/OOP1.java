package java3;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Scanner;

public class OOP1 {

	//List, ArrayList, LinkedList, Map(key)
	public static void main(String[] args) {
		/*
		 응용문제1. 사용자가 입금을 처리하게 됩니다.
		 총 8번의 횟수 금액을 입력하게 되며,
		 모든 입금이 완료 되었을 경우 최종 합계 금액을 출력시키는
		 프로세서를 구축하시오.
		 예시)
		 입금할 금액을 적으세요?
		 500
		 입금할 금액을 적으세요?
		 1000
		 
		 500 1000 500 1500 200 100 50 50
		 최종금액 : 3,900 원
		*/
		int count = 0;
		LinkedList<Integer> ln = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		while(count < 8) {
		System.out.println("입금할 금액을 적으세요?");
		int aa = sc.nextInt();
		ln.add(aa);
		count++;
		}
		sc.close();
		
		int total = 0;
		for (int aa : ln) {
			total += aa;
		}
		System.out.println(ln);
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("최종금액 : " + df.format(total) + " 원");
	}

}
