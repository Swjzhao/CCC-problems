import java.util.Random;

public class RandomCount {

	public static void main(String[] args) {

		int[] count = new int[10];
		int r;

		for (int i = 0; i < 100; i++) {

			r = (int) (Math.random() * 10);

			switch (r) {
			case 0:
				count[0] += 1;
				break;
			case 1:
				count[1] += 1;
				break;
			case 2:
				count[2] += 1;
				break;
			case 3:
				count[3] += 1;
				break;
			case 4:
				count[4] += 1;
				break;
			case 5:
				count[5] += 1;
				break;
			case 6:
				count[6] += 1;
				break;
			case 7:
				count[7] += 1;
				break;
			case 8:
				count[8] += 1;
				break;
			case 9:
				count[9] += 1;
				break;

			}

		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ": " + count[i] + " ");
		}

	}

}
