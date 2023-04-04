package javapro.API;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)					//<-이 annotation은 메소드에 적용해주겠다라는 뜻
@Retention(RetentionPolicy.RUNTIME)			//<-annotation 유지정책 | SOURCE : 컴파일할때 annotation 적용 | CLASS : 클래스가 메모리에서 로딩될때 annotation 적용 | RUNTIME : 실행할때 annotation 적용 

public @interface PrintAnnotation {
	
	String value() default "-";				//인터페이스와 같이 추상메소드를 가진다.
	int number() default 15;				//메소드 default 값을 가지게 할 수 있다.
	
}
