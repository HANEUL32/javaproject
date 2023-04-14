package java1;

import java.util.Arrays;

public class Random2 {
	//random 으로 활용법
	public static void main(String[] args) {
	/*
	 응용문제1.
	 pc가 1부터 46까지의 숫자 6개를 무작위로 생성 합니다.
	 해당 6개의 숫자를 배열화 하여 출력하시오.
	 */
	int number[] = new int[6];
	int f;
	for(f=1;f<=6;f++) {
		int pc = (int)Math.ceil(Math.random()*46);
		number[f-1] = pc;
	}
	System.out.println(Arrays.toString(number));
	}

}
