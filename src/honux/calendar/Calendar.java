package honux.calendar;

import java.util.Scanner;

public class Calendar {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}
	public void printSampleCalendar() {
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21"); 
		System.out.println("22 23 24 25 26 27 28");
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("반복 횟수를 입력하세요");
		int num = sc.nextInt();
		
		int i = 0;
		while(i < num) {
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램

		System.out.println("달을 입력하세요");
		
//		int month, max;
//		String s1 = sc.next();
//		month = Integer.parseInt(s1);
//		
//		if(month % 2 == 0) {
//			if(month == 2) {
//				max = 28;				
//			}else if(month < 8){
//				max = 30;
//			}else {
//				max = 31;
//			}
//		}else {
//			if(month < 8) {
//				max = 31;
//			}else {
//				max = 31;
//			}
//		}
//	
//		System.out.printf("%d월의 최대 일수는 %d일 입니다",month, max);
//		sc.close();
		
		Calendar cal = new Calendar();
		int month = sc.nextInt();
		
		
		System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
		
		//cal.printSampleCalendar();
		
		
		
		i++;
		}
		System.out.println("Bye~");
		sc.close();
	}
	
}

