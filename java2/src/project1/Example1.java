package project1;
/*
(주)데브시스터즈 코딩 면접 -1시간 (집에서 코딩 작성 후 발송)
응용문제4.
업, 다운 퀴즈를 하도록 합니다.
pc가 1~10까지 임의 숫자를 선택 합니다. 단. interface 사용
 
"1~10까지 숫자를 입력하세요"
라는 메세지와 함께 사용자가 숫자 하나 선택 합니다.
 
결과는 pc가 4 라는 숫자를 선택 하였고, 사용자가 8이라는 숫자를
선택하였다면 Down을 만약 사용자가 1이라는 숫자를 선택 하였다면
Up이라는 메세지를 출력합니다. 단, 횟수는 딱 4회만 할 수 있도록 합니다.
pc가 뽑은 숫자와 사용자가 뽑은 숫자가 같을 경우 "정답" 이라는 메세지 출력
4회 이상일 때는 "정답을 맞추지 못했습니다." 라는 결과값을 출력합니다.

*/


import java.util.Random;
import java.util.Scanner;
public class Example1 {
	public static void main(String[] args) {
		games ga = new games(); //외부 클래스 호출
		ga.user(); //외부 메소드 실행
	}
}
class games implements game12{
	Scanner sc;
	int count = 0; //카운터 값 (게임횟수)
	//this.pc : pc가 1~10까지 숫자를 뽑아 저장한 변수값
	@Override
	public void user() {
		sc = new Scanner(System.in);
		System.out.println("1~10까지 숫자를 입력하세요:");
		int my = sc.nextInt();
		if(my > 10) {
			System.out.println("10 이하의 숫자만 입력하세요");
			user();
		}
		else {
			count++;
			if(count > 4) { //4회 이상 틀릴 경우
				System.out.println("정답을 맞추지 못했습니다.");
			}
			else { //4번의 기회
				//return값으로 결과를 받음
				String z = result(game12.pc, my);
				if(z.equals("")) { //결과값이 없으면 정답
					System.out.println("정답 입니다.");
				}
				else { //그 외 결과는 모두 출력
					System.out.println(z);
					user(); //해당 메소드 다시 재 호출
				}
			}
		}
		
	}
	@Override
	//int a : pc 숫자 int b : 사용자가 입력한 숫자
	public String result(int a, int b) {
		String msg = "";
		if(a > b) {
			msg = "UP";
		}
		else if(a < b) {
			msg = "DOWN";
		}
		return msg;
	}
}

