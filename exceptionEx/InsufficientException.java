package javapro.exceptionEx;

public class InsufficientException extends Exception {
	
	public InsufficientException() {								//빈생성자는 따로 생성자를 만들었다면 만들어주는것이 관례
		
	}
	
	public InsufficientException(String message) {					//그냥 exception으로 해도 되지만 관례적으로 exception은 최종적으로 한번만 써야되므로 따로 exception클래스를 만들어서 관리
		super(message);
	}
	
	

}
