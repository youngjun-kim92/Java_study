package javapro.classEx.confirmSpecial;

import java.util.Scanner;

public class BankApplication2 {															//count라는 변수사용 대신에 for문을 이용해서 만든것
	
	private static Account[] accountArray=new Account[100];
	private static Scanner sc=new Scanner(System.in);					
	
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
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i]=new Account(ano, owner, balance);
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
			
		}
	}
	
	
	//계좌목록 메소드
	private static void accountList() {
		System.out.println("-----------------");
		System.out.println("계좌목록");
		System.out.println("-----------------");
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				System.out.print(accountArray[i].getAccountNo()+"     "+accountArray[i].getOwnerName()+"     "+accountArray[i].getBalance());
				System.out.println();
			}	
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
		
		Account account=findAccount(ano);						
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
	private static Account findAccount(String ano) {					
		Account account=null;
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				if(accountArray[i].getAccountNo().equals(ano)) {
					account=accountArray[i];
					break;
				}
			} else break;
		} return account;
	}

	
}
