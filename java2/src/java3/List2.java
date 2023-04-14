package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List2 {
	//kim이 사용자 외에 나머지 사용자를 출력
	public static void main(String[] args) {
		String user[] = {"hong","kim","park","jang"};
		ArrayList<String> al = new ArrayList<>(Arrays.asList(user));
		int ea = al.size();  //4
		int w = 0;
		/*
		 while(w < ea){
		 	ea = al.size();
		 */
		while(w< al.size()) {
			if(al.get(w).equals("kim")) {
				al.remove(w); //remove시 실제 배열 번호가 변경 됩니다.(주의)
			}
			w++;
		}
		System.out.println(al);
		/*
		 응용문제 (ArrayList)
		 해당 배열을 확인 후 짝수의 숫자를 모두 삭제하여	
		 최종 결과 배열을 출력 하시오.
		 10 7 6 1 11 37 41 22
		
		 결과 7 1 11 37 41
		 */
		Integer num1[] = {10, 7, 6, 1, 11, 37, 41, 22};
		ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(num1));
		int ea1 = a2.size();
		int ww= 0;
		while(ww< a2.size()) {
			if(a2.get(ww)% 2 ==0) {
				a2.remove(ww);
			}
			ww++;
		}
		//Collections.sort(a2); //오름차순으로 설정
		Collections.sort(a2,Collections.reverseOrder()); //내림차순으로 설정
		System.out.println(a2); 
	}

}
