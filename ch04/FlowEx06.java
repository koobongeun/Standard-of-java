package ch04;

import java.util.*;
public class FlowEx06 {

	public static void main(String[] args) {
	System.out.printf("현재 월을 입력하세요. >");
	Scanner scanner = new Scanner(System.in);
	int month = scanner.nextInt();
	
	switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재 계절은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재 계절은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재 계절은 가을입니다.");
			break;
		
		default : 
		case 12:
		case 1 :
		case 2 :
			System.out.println("현재 계절은 겨욿입니다.");

		}

	}

}
