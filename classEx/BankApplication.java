package javapro.classEx;

import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {
public static Scanner sc=new Scanner(System.in);
public static AccountConfirm[] accountarray= new AccountConfirm[100];	
	
	public static void main(String[] args) {
		
		boolean run=true;
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			int menuNum=sc.nextInt();
			
			switch(menuNum) {
				case 1:
					System.out.println("계좌 생성");
					createAccount();
					break;
				case 2:
					System.out.println("계좌 목록");
					showAccount();
					break;
			}
		}
		
		
		
		
	}
	//계좌 만들기
	public static void createAccount() {
		System.out.println("계좌번호 : ");
		String accountNum=sc.next();
		System.out.println("계좌주 : ");
		String ownerName=sc.next();
		System.out.println("초기입금액 : ");
		int balance=sc.nextInt();
		AccountConfirm account = new AccountConfirm(accountNum, ownerName, balance);
		
		for(int i=0;i<accountarray.length;i++) {
			accountarray[i]=account;
		}
		System.out.println("계좌가 생성되었습니다.");
	}
	
	//계좌목록 보여주기
	public static void showAccount() {
		
		for(int i=0;i<accountarray.length;i++) {
			if(accountarray[i]!=null) {
				System.out.println(accountarray[i].accountNum);
			}
		}
	}
	
}


