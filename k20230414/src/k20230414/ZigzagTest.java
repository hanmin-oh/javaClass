package k20230414;

import java.util.Arrays;

public class ZigzagTest {
	
	public static void main(String[] args) {
		
		int[][] a = new int[4][6];
		System.out.println("행의 개수: " + a.length);
		System.out.println("열의 개수: " + a[3].length);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(a[0]));
		for(int i = 0 ; i<a.length ; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		int n = 0; //배열에 채워질 숫자를 1식 증가시키는 변수
		for(int i = 0 ; i<a.length; i++) {
			//짝수 행과 홀수 행이 숫자가 채워지는 방향이 다르므로 반복문을 별도로 만든다.
			if(i % 2 == 0) {
				for(int j = 0 ; j<a[i].length ; j++) {
					a[i][j] = ++n;
				}
			}else {
				for(int j = a[i].length - 1 ; j>=0 ; j--) {
					a[i][j] = ++n;
				}
			}
		}
		for(int i = 0 ; i<a.length; i++) {
			for(int j = 0 ; j<a[i].length ; j++) {
				System.out.printf("%2d " ,a[i][j]);	
			}
			System.out.println();
		}
		/*for(int i = 0 ; i<6 ; i++) {
			for(int j = 0 ; j<a[i].length ; j++) {
					a[i][j] = j +1;
				}
				int j = 0;
				System.out.printf("%2d " ,a[i][j]);		
			} */
	}
}
