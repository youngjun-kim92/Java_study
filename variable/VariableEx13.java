package javapro.variable;

public class VariableEx13 {

	public static void main(String[] args) {
		
		int value=150;
		System.out.printf("상품의 수량은 %d개 입니다.\n",value);	//f : format(형식) 
		
		double dvalue=3.14;									//%d : 정수, %f : 실수, %s : 문자열
		System.out.printf("원주율 값=%.2f\n",dvalue);			//%숫자d : 전체 정수를 숫자 입력한 자릿수만큼 출력(빈칸포함), %숫자.숫자f : 전체 실수를 정수부분 몇자리까지 뒤에 소숫점 부분 몇자리까지 출력
		
		String name="홍길동";
		System.out.printf("내 이름은 %s입니다.\n",name);
		
		int amount=7;
		int price=3500;
		System.out.printf("상품의 수량 : %d개\n상품의 가격 : %d원\n",amount,price);
		
		int height=150;
		int weight=62;
		System.out.printf("%s의 키는 %dcm이고 몸무게는 %dkg입니다.",name,height,weight);

	}

}
