package ch01.verify;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) {
		
		InputStream is;
		ObjectInputStream ois;								//inputstream에서 받아온걸 저장
		OutputStream os;
		ObjectOutputStream oos;
		String msg;
		
		try {
			ServerSocket ss=new ServerSocket(7000);
			System.out.println("연결중...");
			while(true) {
				Socket socket=ss.accept();					//클라이언트에서 받아오는 정보를 저장
				is=socket.getInputStream();
				ois=new ObjectInputStream(is);
				msg=(String)ois.readObject();
				System.out.println(msg);
				os=socket.getOutputStream();
				oos=new ObjectOutputStream(os);
				oos.writeObject(msg);
			}
		}
		catch(Exception e) {
			
		}

	}

}
