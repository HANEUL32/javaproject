package java3;

public class Interface3 {
	//user1.java, user2.java 응용편
	/*
	 응용문제2. (주)리노스
	 가입된 모든 사용자의 정보를 출력 합니다.
	 출력형태는 다음과 같습니다.
	 아이디 : hong 고객명 : 홍길동 이메일 : hong@nate.com 지역:서울시 영등포구 
	 
	 */
	public static void main(String[] args) {
		userinfo2 ui = new userinfo2();
		ui.myinfo(null);
	}

}
class userinfo2 implements user1,user2{      
	//user2 인터페이스는 로드 하지 않음. 단, user2에 있는 필드 변수명을 별도로 호출 할 수 있음
	private int total;
	@Override//사용안함
	public void mytel(String usertel) {
		
	}
	@Override
	public int dataea() {
		return user1.super.dataea();
	}
	@Override
	public void myinfo(String userid) {
		int w = 0;
		this.total = dataea();
		while(w < this.total) {
			System.out.printf("\n아이디 : %s 고객명 : %s 이메일 : %s 지역 : %s",
					user2.infodata[w][0],
					user2.infodata[w][1],
					user1.userdata[w][2],		
					user2.infodata[w][2]	
					);
			w++;
		}
		
	}
	@Override//사용안함
	public String pointck(String userid) {
		return null;
	}
	
}
