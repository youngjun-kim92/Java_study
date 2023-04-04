package javapro.exceptionEx;

public class ExceptionEx02 {

	public static void main(String[] args) {
		
		String[] array= {"100","50",null,"loo"};
		
		try {
			for(int i=0;i<=array.length;i++) {
				int value=Integer.parseInt(array[i]);
				System.out.println(value*20);
			}
		}
		
		//catch는 여러개 만들 수 있다
		catch(NumberFormatException e) {																		//숫자로 변환할 수 없을때 에러
			System.out.println("숫자로 변환할 수 없습니다.");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {																//배열 개수 초과 에러
			System.out.println("배열 인덱스를 벗어났습니다.");
		}
		
		catch (Exception e) {																					//*중요* 가장 마지막에 쓰는 exception으로 내가 예상해서 만든 에러외에 다른 에러가 발생할 경우 실행 -> 개발할 때 항상 필수적으로 써야함
			System.out.println("오류가 발생했습니다. 개발자에게 문의하세요(010-7777-3333)"+e.getMessage());
		}
	}

}
