
import java.util.Scanner;

public class Assignment {
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int amount = 0;

		while(true) {
			System.out.println("1 : 지출 금액 입력");
			System.out.println("2 : 지출 금액 확인");
			System.out.println("3 : 프로그램 종료");
			System.out.print("메뉴를 선택해주세요 : ");
			int number = scanner.nextInt();
			
			switch(number) {
				case 1:
					System.out.print("지출 금액을 입력해주세요 : ");
					amount = scanner.nextInt();
					break;
					
				case 2:
					if (amount != 0) {
						System.out.println(amount);
					} else {
						System.out.println("입력되지 않았거나 지출이 0원 입니다.");
					}
					break;
					
				case 3:
					return;
			}
			
		}

	}

}
