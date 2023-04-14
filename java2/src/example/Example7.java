package example;

import java.util.Arrays;
import java.util.Scanner;

public class Example7 {
	/*
		 응용문제3.
		 사용자가 총 7개의 숫자를 입력합니다.
		 7개의 숫자 중 짝수 값이 몇개 입력 되었는지
		 출력하시오. 또한 최종 배열 값도 출력 합니다.
		 Integer로 배열 셋팅		 
	 */
	
	Integer data[] = new Integer[7];	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Example7 ex = new Example7();
		ex.abc();
	}
	
	public void abc() {
		System.out.println("7개의 숫자를 입력하세요");
		int w = 0;
		int ea = this.data.length;
		for(int i = 0; i<ea; i++) {
			this.data[i] = sc.nextInt();
			if(this.data[i] % 2 ==0) {
				w++;
			}
		}
		System.out.println("짝수의 개수는 " +w+ " 개입니다.");
		System.out.printf("%s",Arrays.toString(this.data)); //배열은 %d가 아니라 %s를 넣어줘야 한다.
		this.sc.close();
	}

}
