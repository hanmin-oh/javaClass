package Stage1;

import java.util.Scanner;

public class Num7 {

	public static void main(String[] args) {
			/*입력
			첫째 줄에 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어진다. 아이디는 알파벳 소문자로만 이루어져 있으며, 
			길이는 50자를 넘지 않는다.
			
			출력
			첫째 줄에 준하의 놀람을 출력한다. 놀람은 아이디 뒤에 ??!를 붙여서 나타낸다.
			
			예제 입력 1 예제 입력 2 
			joonas      baekjoon
			예제 출력 1  예제 출력 2 
			joonas??!    baekjoon??!
			*/
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		System.out.println(id + "??!");
		scanner.close();
	}

}
