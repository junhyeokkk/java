package sub2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 날짜 : 2024/07/24
 * 이름 : 최준혁
 * 내용 : 소켓 통신 실습하기
 */
public class SocketServer {
	public static void main(String[] args) {
		
		
		System.out.println("[Server]");
		
		ServerSocket serversocket = null;
		
		try {
			serversocket = new ServerSocket();
			serversocket.bind(new InetSocketAddress("127.0.0.1",50001));
			
			System.out.println("연결 대기...");
			Socket socket = serversocket.accept();
			
			System.out.println("연결 수립...");
			
			//데이터 수신(Clinet -> Server)
			InputStream is = socket.getInputStream();
			byte[] bytes = new byte[100];
			int readBytes = is.read(bytes);
			
			String message = new String(bytes, 0, readBytes, "UTF-8");
			System.out.println(message);
			
			System.out.println("데이터 수신 완료...");
			
			//데이터 송신(Clinet <- Server)
			String sendmessage = "Hello Client";
			OutputStream os = socket.getOutputStream();
			byte[] cbytes = sendmessage.getBytes();
			os.write(cbytes);
			os.flush();
			
	
			System.out.println("데이터 송신 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(!serversocket.isClosed()) {
			try {
				serversocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Server 종료");
	}
}
