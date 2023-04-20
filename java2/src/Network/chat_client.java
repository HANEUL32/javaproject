package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chat_client {
	//채팅 클라이언트
	public static void main(String[] args) {
		chat_cl ch = new chat_cl();
		ch.client();

	}
}
class chat_cl{
	private String ip = "192.168.10.155";
	private int port = 10001;
	Socket so = null;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	private String mid = "";
	private String msg = ""; //메세지 출력
	
	public void client() {
		int count = 0;
		try {
			this.sc = new Scanner(System.in);
			System.out.println("login id:");
			this.mid = this.sc.nextLine();	
			while(true) {
				this.so = new Socket(this.ip,this.port);
				this.is = this.so.getInputStream(); //서버에서 받아오는 메세지
				this.os = this.so.getOutputStream(); //서버로 보내는 메세지
				if(count==0) {
				this.msg = "["+this.mid+"] Go in";
				}
				else {
					this.os.write(this.msg.getBytes());
					System.out.println("message: ");
					String cms = this.sc.nextLine();
					this.msg = "["+this.mid+"]:" + cms;
					if(cms.equals("exit")) {
						this.msg = "chatroom out";
						this.is.close();
						this.sc.close();
						this.so.close();
					}
					else {
						this.msg = "["+this.mid+"]:" + cms;
					}
				}
				count++;			
				this.os.write(this.msg.getBytes());
				this.os.flush();
				byte msg[] = new byte[1024];
				int n = this.is.read(msg);
				String servertext = new String(msg,0,n);
				System.out.println(servertext);
			}
			
		}
		catch (Exception e) {
			System.out.println("Server Connect Error!!");
		}
	}
}
