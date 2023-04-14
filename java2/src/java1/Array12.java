package java1;

import java.util.Arrays;

public class Array12 {

	public static void main(String[] args) {
		/*
		 응용문제8.
		 데이터 배열에 있는 모든 짝수값에 합산 결과를 출력하시오.
		 단, 해당 배열은 2차 배열 형태 입니다.
		 
		 1번 데이터 : 11 42 22 16
		 2번 데이터 : 7 33 10 29
		 최종결과값 : 90
		 */
		int data1[][] = {
				{11,42,22,16},
				{7,33,10,29}
		};
		int ea1 = data1[0].length;
		int sum = 0;
		int cnt = 0;
		while(cnt<ea1){
			if(data1[0][cnt] % 2 == 0) {
				sum += data1[0][cnt];
			}
			if(data1[1][cnt] % 2 == 0) {
				sum += data1[1][cnt];
			}
			cnt++;
		}
		System.out.println(sum);
	}

}
