package java1;

public class index4 { //클래스명

	public static void main(String[] args) { //메인 메소드
		//반복문 사용(for문)
		int f;
		for(f=1; f<=10; f++) {
			//System.out.println(f);
		}
		
		//더블for문
		int a,b;
		for(a=2;a<10;a++) {
			for(b=1;b<10;b++) {
				System.out.printf("%d*%d=%d\n",a,b,(a*b));
			}
		}
		
		/*
		 응용문제2.
		 숫자 45 ~ 60까지 총 합산한 결과값을 출력하시오.
		 */
		int dd;
		int ee = 0;
		for(dd=45; dd<=60; dd++) {
			ee += dd;
		}
		System.out.println(ee);
		
		/*
		 응용문제3.
		 1~200까지 숫자 중 홀수값만 모두 더한 결과값을 출력하시오.
		 */
		int aa;
		int bb = 0;
		for(aa=1; aa<=200; aa++) {
			if(aa % 2 == 1) {
				bb += aa;
			}
		}
		System.out.println(bb);
		
		/*
		 응용문제4.
		 20~60까지 숫자 중 3의 배수 값만 모두 더한 후 짝수 인지 홀수 인지를 출력하시오.
		 */
		int g;
		int e = 0;
		for(g=20; g<=60; g++) {
			if(g % 3 == 0) {
				e += g;
			}
		}
		if(e % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else if(e % 2 == 1) {
			System.out.println("홀수입니다.");
		}
		//System.out.println(e);
		
		/*
		 응용문제5.
		 구구단 7단 ~ 3단까지 역순으로 출력되도록 하시오.
		 단, 그 중 결과값이 홀수인 값만 출력 됩니다.
		 */
		int p,q,o;
		for(p=7; p>=3; p--) {
			for(q=9; q>=1; q--) {
				o = p * q;
				//System.out.println(o);
				if(o % 2 == 1) {
					System.out.printf("%d*%d=%d\n",p,q,o);
			}
			}
		}
	}

}
