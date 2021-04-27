package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class studentScore {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student("s009","신희철",60,80,90));
		stuList.add(new Student("s010","이이호",80,60,90));
		stuList.add(new Student("s008","박문규",60,99,20));
		stuList.add(new Student("s004","아이유",50,80,10));
		stuList.add(new Student("s007","박찬호",88,54,20));
		stuList.add(new Student("s005","박지성",15,80,22));
		stuList.add(new Student("s001","추신수",64,80,55));
		stuList.add(new Student("s003","손흥민",62,81,44));
		stuList.add(new Student("s002","전지현",99,82,50));
		stuList.add(new Student("s006","박보영",8,99,90));
		
		
		System.out.println("정렬전");
		
		
		for(Student stu : stuList) {
			System.out.println(stu);
		}
		
		System.out.println("------------------------------------");
		System.out.println("학번의 오름차순");
		Collections.sort(stuList);
		int r =1;
		for(int i=0;i<stuList.size();i++) {
			stuList.get(i).setRank(r);
			r++;
		}
		
		for(Student stu : stuList) {
			System.out.println(stu);
		}
		
		System.out.println("------------------------------------");
		
		
		System.out.println("총점의 역순정렬과 총점이 같으면 학번의 내림차순 ");
		Collections.sort(stuList,new SumSort());
		r =1;
		for(int i=0;i<stuList.size();i++) {
			stuList.get(i).setRank(r);
			r++;
		}
		
		for(Student stu1: stuList) {
			
			System.out.println(stu1);
		}
		
		System.out.println("------------------------------------");
		
		
	}

}

class SumSort implements Comparator<Student>{
@Override
public int compare(Student stu1, Student stu2) {
	int ret =0;
	if(new Integer(stu1.getSum()).compareTo(stu2.getSum()) == 1 ) ret = -1;
	if(new Integer(stu1.getSum()).compareTo(stu2.getSum()) == -1 ) ret =  1;
	if(new Integer(stu1.getSum()).compareTo(stu2.getSum()) == 0 ) ret=  -1;
	
	return ret;
	}

}


class Student implements Comparable<Student>{
	private String idNum;	//학번
	private String name;	//이름
	private int kor;		//국어
	private int eng;		//영어
	private int math;		//수학
	private int sum;		//총점
	private int rank;		//등수
	
	
	
	
	
	public Student(String idNum, String name, int kor, int eng, int math) {
		super();
		this.idNum = idNum;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = kor+eng+math;
		 
	}





	public String getIdNum() {
		return idNum;
	}





	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public int getKor() {
		return kor;
	}





	public void setKor(int kor) {
		this.kor = kor;
	}





	public int getEng() {
		return eng;
	}





	public void setEng(int eng) {
		this.eng = eng;
	}





	public int getMath() {
		return math;
	}





	public void setMath(int math) {
		this.math = math;
	}





	public int getSum() {
		return sum;
	}





	public void setSum(int sum) {
		this.sum = sum;
	}





	public int getRank() {
		return rank;
	}





	public void setRank(int rank) {
		this.rank = rank;
	}











	@Override
	public String toString() {
		return "Student [idNum=" + idNum + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", sum=" + sum + ", rank=" + rank + "]";
	}

	@Override
	public int compareTo(Student stu) {
		return this.getIdNum().compareTo(stu.getIdNum());
	}
	
	
	
	
}