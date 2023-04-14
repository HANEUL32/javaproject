package java1;

import java.util.Arrays;

public class Array8 {
	//배열합치기 응용
	public static void main(String[] args) {
		/*
		 응용문제7
		 데이터 배열 2가지가 있습니다. 해당 데이터 배열을 다음 결과 처럼 값을 출력하시오.
		 1번 DATA : 대한민국 일본 중국 베트남 태국
		 2번 DATA : 40 35 70 55 32
		 결과출력 DATA
		 ["대한민국(40)","일본(35)","중국(70)","베트남(55)","태국(32)"]
		 */
		//내꺼
		String[] country = {"대한민국","일본","중국","베트남","태국"};
		int[] num2 = {40, 35, 70, 55, 32};
		int ea1 = country.length;
		String[] mynum = new String[ea1];
		int w = 0;
		while(w<ea1) {
				mynum[w] = country[w] + "(" + num2[w] + ")"; //문자 + 숫자 결합되어서 그냥 적용됨.
				w++;
		}
		System.out.println(Arrays.toString(mynum));
		
		
		//쌤꺼
		String data1[] = {"대한민국","일본","중국","베트남","태국"};
		int data2[] = {40,35,70,55,32};
		String data3[] = new String[data1.length];
		
		int z = 0;
		while(z < data1.length) {
			//data3[z] = data1[z] + "(" + String.valueOf(data2[z])+")";
			data3[z] = data1[z] + "(" + Integer.toString(data2[z])+")";
			z++;
		}
		System.out.println(Arrays.toString(data3));
	}

}
