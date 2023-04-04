package javapro.collection;

import java.io.IOException;
import java.util.Properties;

public class PropertiesEx01 {

	public static void main(String[] args) throws IOException {
		Properties properties=new Properties();														//Properties는 Hashtable(Hashmap)과 똑같은 구조를 가짐 -> 키와 값을 String타입으로 제한
		properties.load(PropertiesEx01.class.getResourceAsStream("database.properties"));
		String driver=properties.getProperty("driver");
		String url=properties.getProperty("url");
		String username=properties.getProperty("username");
		String password=properties.getProperty("password");
		String admin=properties.getProperty("admin");
		
		System.out.println("데이터베이스 드라이버 : "+driver);
		System.out.println("서버 호스팅 : "+url);
		System.out.println("계정이름 : "+username);
		System.out.println("계정비밀번호 : "+password);
		System.out.println("관리자 : "+admin);
		
	}

}
