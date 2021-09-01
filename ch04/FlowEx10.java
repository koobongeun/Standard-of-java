package ch04;

import java.util.*;
public class FlowEx10 {

	public static void main(String[] args) {
	
	int score = 0;
	char grade = ' ';
	
	System.out.print("당신의 점수를 입력하세용 (1~100) > ");
	
	Scanner scanner = new Scanner(System.in);
	String tmp = scanner.nextLine();
	score = Integer.parseInt(tmp);
	
	switch(score/10) {
	case 10 : case 9 : grade = 'A'; break;
	
	case 8 : case 7 : grade = 'B'; break;
	
	default : grade = 'C';
		}
	System.out.print("당신의 학점은 " + grade + "입니다.");
	}

}
