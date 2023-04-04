package javapro.classEx.confirmSpecial;

import java.util.Scanner;

public class BankApplication {
	
	private static Account[] accountArray=new Account[100];
	private static Scanner sc=new Scanner(System.in);					//<--둘다 메인메소드 안에 만들어도 되지만 그러면 너무 지저분해지고 복잡해지므로 그냥 밖으로 뺌(메인 메소드말고 클래스 안에 전체적으로 적용시키려는 이유도 있음)
	private static int count=0;											//배열 초기값 0으로 설정
	
	public static void main(String[] args) {
		
		boolean run=true;
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo=sc.nextInt();
			
			switch(selectNo) {
				case 1:
					createAccount();
					break;
				case 2:	
					accountList();
					break;
				case 3:
					deposit();
					break;
				case 4:
					withdraw();
					break;
				case 5:
					run=false;
					break;
			}
			
		}
		System.out.println("프로그램 종료");
		
	}
	
	//계좌생성 메소드
	private static void createAccount() {
		System.out.println("-----------------");
		System.out.println("계좌생성");
		System.out.println("-----------------");
		
		System.out.print("계좌번호 : ");
		String ano=sc.next();
		
		System.out.print("계좌주 : ");
		String owner=sc.next();
		
		System.out.print("초기입금액 : ");
		int balance=sc.nextInt();
		
		accountArray[count]=new Account(ano, owner, balance);			//0번째 배열에 입력한 값이 저장
		System.out.println("결과 : 계좌가 생성되었습니다.");
		count++;														//다시 1번을 눌러 계좌를 생성하면 count가 1늘어서 다음번째 배열에 저장!!(매우중요)
		
	}
	
	
	//계좌목록 메소드
	private static void accountList() {
		System.out.println("-----------------");
		System.out.println("계좌목록");
		System.out.println("-----------------");
		
		for(int i=0;i<count;i++) {
			System.out.print(accountArray[i].getAccountNo()+"     "+accountArray[i].getOwnerName()+"     "+accountArray[i].getBalance());
			System.out.println();
		}
	}
	
	//예금 메소드
	private static void deposit() {
		System.out.println("-----------------");
		System.out.println("예금");
		System.out.println("-----------------");
		System.out.print("계좌번호 : ");
		String ano=sc.next();
		System.out.print("예금액 : ");
		int amount=sc.nextInt();
		
		Account account=findAccount(ano);								//account라는 인스턴스객체에 계좌번호정보만 들어간거? --> 계좌번호찾기 메소드에서 Account 클래스에 있는 account정보 세개가 전부 들어가는거임 헷갈리지말것
		if(account==null) {
			System.out.println("결과 : 계좌가 없습니다.");
		}
		else {
			account.setBalance(account.getBalance()+amount);
			System.out.println("결과 : 예금이 성공되었습니다.");
		}
		
		
	}
	
	//출금 메소드
	private static void withdraw() {
		System.out.println("-----------------");
		System.out.println("출금");
		System.out.println("-----------------");
		System.out.print("계좌번호 : ");
		String ano=sc.next();
		System.out.print("출금액 : ");
		int amount=sc.nextInt();
		
		Account account=findAccount(ano);
		if(account==null) {
			System.out.println("결과 : 계좌가 없습니다.");
		}
		else {
			if(account.getBalance()<amount) {
				System.out.println("결과 : 잔액이 부족합니다.");
			}
			else {
				account.setBalance(account.getBalance()-amount);
				System.out.println("결과 : 출금이 성공되었습니다.");
			}	
		}
		
	}
	
	//계좌번호 찾기 메소드
	private static Account findAccount(String ano) {					//Account 클래스를 참조해서 메소드 만들어서 클래스이름을 붙인건가...? --> 맞음
		Account account=null;
		for(int i=0;i<count;i++) {
			if(accountArray[i].getAccountNo().equals(ano)) {
				account=accountArray[i];
				break;
			}
		} return account;
	}

	
}
