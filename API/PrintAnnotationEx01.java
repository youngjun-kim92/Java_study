package javapro.API;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationEx01 {

	public static void main(String[] args) throws Exception {
		
		Method[] dcMethod=Service.class.getDeclaredMethods();							//Service라는 클래스의 메소드 전체를 갖고와서 넣어줌
		for(Method method:dcMethod) {
			//System.out.println(method); 												//메소드 정보를 차례대로 갖고오는게 아님
			PrintAnnotation printAnno=method.getAnnotation(PrintAnnotation.class);
			printLine(printAnno);
			method.invoke(new Service());												//Service 클래스의 메소드 호출
			printLine(printAnno);
		}

	}

	//출력메소드
	public static void printLine(PrintAnnotation printAnno) {
		int num=printAnno.number();
		for(int i=0;i<num;i++) {
			String val=printAnno.value();
			System.out.print(val);
		}
		System.out.println();
	}
}
