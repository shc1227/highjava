package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class baseballGame {
	public static void main(String[] args) {
		
		Set<Integer> play = new HashSet<>();
		Scanner sc= new Scanner(System.in);
		
		
		while(play.size()<3){
			int a = (int)(Math.random()*9)+1;
			play.add(a);
		}
		
		Iterator<Integer> it = play.iterator();
		 
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			
			
		}
		int n=0; 
		System.out.println(" 3자리 중복없이 1~9 입력하세요.");
		while(true){
			int S = 0; int B =0; 	
		System.out.print("입력>");
		int input =sc.nextInt();
		int p1 = input/100; 
		int p2 = input%100/10; 
		int p3 = input%100%10/1; 
		
		System.out.println(p1+" "+p2+" "+p3);
		if(play.add(p1) == true) {
			play.remove(p1);
			B++;
		}else if(play.add(p1) == false) {
			S++;
		}
		
		if(play.add(p2)== true) {
			play.remove(p2);
			B++;
		}else if(play.add(p2) == false) {
			S++;
		}
		if(play.add(p3) == true){
			play.remove(p3);
			B++;
		}else if(play.add(p3) == false) {
			S++;
		}
		
	
		n=n+1;
		System.out.println();
		System.out.println(S+"S "+B+"B");
		
		if(S==3) {
			System.out.println(n+"번째 완료");
			break;
		}
		}//while
		
		
	}
}
