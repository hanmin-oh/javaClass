package k20230407;

import java.util.Random;

public class DiceTest {

	public static void main(String[] args) {
		
		Random random = new Random();
		int num1 = 0,  num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;
		for (int i=0 ; i<10 ; i++) {
			System.out.println(random.nextInt(6) +1);
		int dice = random.nextInt(6) +1 ;
		
//		주사위 눈의 개수를 샌다.		
//			if (dice == 1) {
//				num1++;
//			}
//			else if (dice ==2) {
//				num2++;
//			}
//			else if (dice ==3) {
//				num3++;
//			}  
//			else if (dice ==4) {
//				num4++;
//			}
//			else if (dice ==5) {
//				num5++;
//			}
//			else {
//				num6++;
//			}
		
			switch (dice) {
				case 1 :
					num1++;
					break;
				case 2 :
					num2++;
					break;
				case 3 :
					num3++;
					break;
				case 4 :
					num4++;
					break;
				case 5 :
					num5++;
					break;
				case 6 :
					num6++;
					break;
			}
		}
		System.out.println("1의 개수:" + num1);
		System.out.println("2의 개수:" + num2);
		System.out.println("3의 개수:" + num3);
		System.out.println("4의 개수:" + num4);
		System.out.println("5의 개수:" + num5);
		System.out.println("6의 개수:" + num6);
		
		
//		int[] dice = {1, 2, 3, 4, 5, 6};
//		
//		System.out.println(random.(dice));
		
	}
}
