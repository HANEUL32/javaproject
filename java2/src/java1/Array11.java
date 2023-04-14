package java1;

import java.util.Arrays;

public class Array11 {
	//2차배열 응용편
	public static void main(String[] args) {
		/*
		 응용문제7.
		 2차배열로
		 Adata와 Bdata 두가지 배열값을 더한 후
		 해당 배열값을 기준으로 짝수, 홀수인지를 나열하는
		 배열 결과를 출력하는 코드를 작성하시오.
		 
		 Adata = 5 17 19 22 33
		 Bdata = 1 2 3 4 5
		 Result = ["짝수","홀수","짝수","짝수","짝수"]
		 */
		 int data1[][] = {
				 {5,17,19,22,33},
				 {1,2,3,4,5}
		 };
		 int ea1 = data1[0].length; //배열 갯수
		 String[] mynum = new String[ea1]; //빈배열 만들어주기(길이5).
		 int cnt = 0; //카운팅 값.
		 int sum = 0; 
		 do {
			 sum = data1[0][cnt] + data1[1][cnt]; //더한값
			 //System.out.println(sum);
			 if(sum % 2 == 0) {
				 mynum[cnt] = "짝수";
			 }
			 else {
				 mynum[cnt] = "홀수";
			 }
			 cnt++;
		 }while(cnt<data1[0].length);
		 System.out.println(Arrays.toString(mynum)); //배열 내용 출력하기
		 
		 //쌤코드 (똑같음)
		 int data2[][] = {
				 {5,17,19,22,33},
				 {1,2,3,4,5}
		 };
		 int ea2 = data2[0].length; //배열 그룹에 있는 데이터 객체 수(5)
		 int w = 0;
		 String result[] = new String[ea2];
		 while(w < ea2) {
			 int total = data2[0][w] + data2[1][w];
			 if(total % 2 == 0) {
				 result[w] = "짝수";
			 }
			 else {
				 result[w] = "홀수";
			 }
			 w++;
		 }
	}

}
