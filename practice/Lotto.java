package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lotto {
	Scanner sc = new Scanner(System.in);	
	public static void main(String[] args) {
		new Lotto().start();
		
	}
	
	
	
	
	 void buy() {
		System.out.println("=====================");
		System.out.println("Lotto 구입");
		System.out.print("금액입력: ");
		int price = sc.nextInt();
		
		int amount = price/1000; //가격에 따른 번호 개수
		int changes = price%1000; //잔돈
		
	
		for(int i=0;i<amount;i++) {
		
		//1~45의 중복되지 않는 6자리
		Set<Integer> Lotto = new HashSet<>();
		while(Lotto.size()<6) {
			int ran = (int)(Math.random()*45)+1;
			Lotto.add(ran);
			}
			System.out.println("로또 번호"+(i+1)+ " :"+Lotto);
		}
		
		System.out.println("잔돈 : "+ changes);
		System.out.println("=====================");
	}
	
	public void start() {
		while(true) {
			System.out.println("=====================");
			System.out.println("Lotto 프로그램");
			System.out.println("---------------------");
			System.out.println("1. 로또 구입");
			System.out.println("2. 프로그램 종료");
			System.out.println("=====================");
			System.out.print("입력>>");
			int input = sc.nextInt();
			switch(input) {
			case 1:
				buy();
				break;
			case 2:
				System.out.println("프로그램 종료 감사합니다.");
				System.exit(0);
				break;
			}
		
		
		
		}
		
		
			
	}
	
	
}
