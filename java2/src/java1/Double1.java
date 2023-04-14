package java1;

public class Double1 {

	public static void main(String[] args) {
		/*
		 응용문제5. (do~while문)
		 다음과 같이 합계를 출력하는 loop문을 작성하시오.
		 예시)
		 5+5=10
		 5+4=9
		 5+3=8
		 ....
		 2+5=7
		 2+4=6
		 ...
		 2+1=3
		 */
		int a = 5;
		int sum = 0;
		do {
			int b = 5;
			do {
			sum = a + b;
			System.out.println(a +"+" + b + "=" + sum);
			b--;
			}while(b>=1);
			a--;
		}while(a>=2);
	}

}
