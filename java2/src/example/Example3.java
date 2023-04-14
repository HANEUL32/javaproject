package example;

import java.util.Scanner;
/*
 응용문제1.
 질문 "7000원 결제 하시겠습니까?" 라고 출력되며,
 숫자 1을 입력하면, "결제가 진행 됩니다" 라고 출력 후 프로세서는 종료됩니다.
 숫자 2를 입력하면, "결제가 취소 되었습니다." 라고 출력 후 동일하게 프로세서는 종료됩니다.
 */


public class Example3 {
	
	final int money = 7000;
	
	public static void main(String[] args) {
		aaa();
	}
	public static void aaa() {
		Scanner sc = new Scanner(System.in); //가상으로 입력받는 클래스.
		System.out.println("7000원 결제 하시겠습니까?");
		int aa = sc.nextInt();
		if(aa == 1) {
		System.out.println("결제가 진행 됩니다.");
		}
		else if(aa == 2) {
			System.out.println("결제가 취소 되었습니다.");
		}
		sc.close();
	}

}
