package java1;

import java.util.Scanner;
import java.util.Arrays;

public class Array7 {
	//배열 생성 응용편
	public static void main(String[] args) {
		/*
		 응용문제6.(다시)
		 사용자가 상품을 검색합니다. 사용자가 검색한 내용을 배열로 저장 되도록 하십시오.
		 "검색종료" 단어 입력시 프로세서는 종료 됩니다.
		 예시) 
		 상품검색 : 선풍기 
		 상품검색 : 냉장고
		 상품검색 : 모니터 
		 상품검색 : 검색종료
		 
		 [선풍기,냉장고,모니터,null,null,null,null];
		 */
		String keyword[] = new String[7];
		Scanner sc = new Scanner(System.in);
		int w = 0;
		while(w < 7) {
			System.out.println("상품검색 :");
			/* String key = sc.nextLine(); //띄어쓰기 때문에 nextLine 사용
			keyword[w] = key; //keyword[w] = sc.nextLine(); 도가능.
			*/
			String word = sc.nextLine().intern();
			if(word=="검색종료") {
				//Arrays.toString : 숫자,문자,소수[] 현재 배열 변수값을 출력하는 함수 입니다.
				System.out.println(Arrays.toString(keyword));
				break;
			}
			else {
				keyword[w] = word;
			}
			w++;
			sc.close();
		}
	}

}
