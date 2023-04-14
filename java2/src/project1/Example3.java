package project1;
/*
 (주)CJ운송에서 테스트 코딩
 사용자가 8명 있습니다.
 각각의 사용자에게 포인트를 주어야 합니다. 다음 결과와 같이 나오도록 코드를 작성하시오.
 customer data : 서울 경기도 인천 대전 충북 충남 전북 전남
 
 "서울 님에게 포인트 추가 하시겠습니까?"
 "전남 님에게 포인트 추가 하시겠습니까?"
 
 무조건 숫자를 입력하며 숫자 외에 입력시 "포인트는 숫자만 입력합니다." 출력

 단, 인천님 포인트 입력시 문자를 사용하여 오류 발생이 되면 다시
 "인천 님에게 포인트 추가 하시겠습니까?" 라고 질문이 나와야 합니다.
 
 최종결과 정보
 서울 : 500
 경기도 : 300
 인천 : 300
 ...
 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		custom aa = new custom();
		aa.data1();

	}

}
class custom{
	String customer[];
	Scanner sc;
	int point = 0;
	public void data1(){
	this.customer = new String[] {"서울", "경기도", "인천", "대전", "충북", "충남", "전북", "전남"};
	System.out.println(Arrays.toString(customer));
	int ea = customer.length;
	ArrayList<String> map = new ArrayList<>();
	int count=0;
	while(true) {
		
			try {
			this.sc = new Scanner(System.in);
			System.out.println(customer[count]+"님에게 포인트를 추가 하시겠습니까?");
			this.point = this.sc.nextInt();
			map.add(customer[count] + " : " + point);		
			count++;
			if(count >= ea) {
				break;
			}
			} 
			catch (Exception e) {
            System.out.println("포인트는 숫자만 입력합니다.");
            continue;
			}
    	}
	System.out.println(map);
	
	}


}
