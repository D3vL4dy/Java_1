package a_variable;

import java.util.Scanner;

public class Join {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("============회원가입============");
		System.out.println("아이디>");
		String id = sc.nextLine();
		System.out.println("비밀번호(4자리숫자)>");
		int pwd = Integer.parseInt(sc.nextLine());
		System.out.println("이름>");
		String name = sc.nextLine();
		System.out.println("나이>");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("키>");
		double height = Double.parseDouble(sc.nextLine());
		System.out.println("==============================");
		System.out.println("회원가입 완료!!");
		System.out.println("============내 정보============");
		System.out.println("아이디 : "+ id);
		System.out.println("비밀번호(4자리숫자) : "+ pwd);
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age + "세");
		System.out.println("키 : "+ height + "cm");
		sc.close();
		
		
		//다음과 같은 프로그램을 작성해주세요.
		/*
		 *============회원가입============
		 *아이디>admin  
		 *비밀번호(4자리숫자)>1234
		 *이름>홍길동
		 *나이>99
		 *키>185.5
		 *==============================
		 *회원가입 완료!!
		 *============내 정보============
		 *아이디 : admin
		 *비밀번호 : 1234
		 *이름 : 홍길동
		 *나이 : 99세
		 *키 : 185.5cm
		 *==============================
		 *스캐너로 입력을 받으면 회원가입 완료
		 *입력받은 내용을 출력
		 */

	}

}
