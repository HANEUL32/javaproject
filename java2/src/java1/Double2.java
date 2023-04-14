package java1;

public class Double2 {

	public static void main(String[] args) {
		/*
		 응용문제6.
		 구구단 9단 중 9*64까지 숫자 중 결과값이 홀수에 대한 
		 평균값 결과를 출력 하시오.
		 */
	     int a = 9;
	     int b = 1;
	     int c;
	     int sum = 0;
	     int sum2 = 0; //카운팅 갯
	      do{
	         c = a * b;
	         if(c % 2 == 1) {
	            sum += c;
	            sum2++;
	         }
	         b++;
	      }while(b<=64);
	      System.out.println(sum/sum2);
	}

}
