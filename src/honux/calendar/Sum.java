package honux.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String args[]) {
//		//입력: 키보드로 두 수의 입력을 받는다.
//		System.out.print("두 수 입력 : ");
//		Scanner sc = new Scanner(System.in); // System.in : 키보드
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		//출력: 화면에 두 수의 합을 출력한다.
//		int sum = a + b;
//		System.out.println(sum);
		
		int a,b;
		
		//입력: 키보드로 두 수의 입력을 받는다.
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		System.out.println("두 수를 입력해주세요.");
		s1 = sc.next();
		s2 = sc.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		//출력: 화면에 두 수의 합을 출력한다.
		System.out.printf("%d와 %d의 합은 %d입니다.", a, b, a+b);
		sc.close();
		
		
	}

}
