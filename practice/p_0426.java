package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import kr.or.ddit.basic.T03_ListSortTest;

public class p_0426 {
	
	public static void main(String[] args) {
	/*	Scanner sc = new Scanner(System.in);
		LinkedList<String> stack =  new LinkedList<>();
		
		
		stack.push("사과");
		stack.push("바나나");
		stack.push("메론");
		stack.push("복숭아");
		System.out.println(stack);
		String fruit1 = stack.pop(); 
		String fruit2 = stack.pop(); 
		String fruit3 = stack.pop(); 
		System.out.println(fruit1);
		System.out.println(fruit2);
		System.out.println(fruit3);
		System.out.println(stack);

		LinkedList<String> queue = new LinkedList<>();
		queue.offer("001");
		queue.offer("002");
		queue.offer("003");
		queue.offer("004");
		queue.offer("005");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		queue.poll();
		if(queue.offer("001")) {System.out.println("신규 등록");};
		System.out.println(queue);
		
		
		List<String> abcd = new ArrayList<String>();
		abcd.add("B");
		abcd.add("E");
		abcd.add("Z");
		abcd.add("A");
		
		System.out.println("정렬 전 : "+abcd);
		Collections.sort(abcd);
		System.out.println("정렬 후 : "+abcd);
		//문제1
		/*
		 * 5명의 사람 이름을 입력받아 ArrayList에 저장하고 이중에서 '김'씨 성의 이름을 출력하시오.
		 *  
		 */
		/*
			ArrayList<String> name = new ArrayList<>();
			
			for(int i= 0;i<5;i++) {
				System.out.print("입력>");
				String input =  sc.nextLine();
				
				name.add(input);
			}
			
			String[] strname = name.toArray(new String[0]);
			
			for(int i=0;i<strname.length;i++) {
				if(strname[i].substring(0,1).equals("김")) {
				System.out.println(strname[i]+", ");
				}
			}
			
			*/
			
			ArrayList nickname = new ArrayList<>(); 
			nickname.add("호두까기");
			nickname.add("뻥");
			nickname.add("시베리아호랑이야생수컷");
			nickname.add("호랑");
			
			nickname.set(0,((String) nickname.get(0)).length());
			nickname.set(1,((String) nickname.get(1)).length());
			nickname.set(2,((String) nickname.get(2)).length());
			nickname.set(3,((String) nickname.get(3)).length());
			
			Collections.sort(nickname);
			int Max = 0;
			for(int i=0;i<nickname.size();i++) {
				Max = (int) nickname.get(0);
				if((int) nickname.get(i)>Max) {
					Max =(int) nickname.get(i);
				}
				
			}
			
				
				System.out.println(Max);
			
			
			
			
		//문제2
		
		/*
		 * 5명의 별명을 입력하여 ArrayList에 저장하고 별명의 길이가 제일 긴 별명을 출력하시오.
		 * (단, 각 별명의 길이는 모두 다르게 입력)
		 */

	}

}
