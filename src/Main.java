import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		App.run = new App();
		System.out.println("== 명언 앱 실행 ==");
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("명령어 ) ");	
			String Say = sc.nextLine();
			System.out.print("명언 :");
			String author = sc.nextLine();
			System.out.print("작가 :");
			String content = sc.nextLine();
			if (sc.equals("종료"))
				;
			break;
		}
	}
}
