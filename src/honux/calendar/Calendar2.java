package honux.calendar;

import java.util.Scanner;

public class Calendar2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String PROMPT = "> ";
		
		while(true) {
		System.out.println("월을 입력하세요.");
		System.out.println(PROMPT);
		int month = sc.nextInt();
		int days = 1;
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
	
					if(month == -1) {
						break;
					}
					if(days > maxDays[month-1]+1) {
						continue;
					}
					System.out.println("일 월 화 수 목 금 토");
					System.out.println("----------------");
							
					for(int j = 0; j < 7 ; j++) {
						System.out.print(days + " ");
						days ++ ;
						
					}
					System.out.println();
					
					
					
				
			
		
		
		}
		System.out.println("Bye~");

	}

}
