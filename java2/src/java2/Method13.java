package java2;

import java.util.Scanner;

public class Method13 {

	public static void main(String[] args) {
		gugudan2 g = new gugudan2();
		g.gugu();
	
	}
}
/*
 응용문제1. 사용자가 구구단 숫자를 하나 입력 합니다.
 세컨 개발자가 입력된 사항을 1~9까지 결과가 출력되는 구구단을 개발 합니다.
 단, 상속 받은 메소드에서 처리 되도록 코드를 작성완료 하시오.
 결과) 검색할 구구단을 입력하세요? 5
 5*1=5
 ....
 5*9=45
 */
 
class gugudan{
	protected int number;
	Scanner sc = new Scanner(System.in);
	public void gugu() {
		System.out.println("검색할 구구단을 입력하세요?");
		this.number = sc.nextInt();
		sc.close();
	}
	public void result(int nm) {
		
	}
}
class gugudan2 extends gugudan{
	@Override
	public void gugu() {
		super.gugu();
		result(this.number);
		 
	}
	@Override
	public void result(int nm) {
		super.result(nm);
		for(int i=1; i<=9; i++) {
			 System.out.println(this.number + " * " + i + " = " + (this.number * i));
		}
	}
	
}
