import java.util.Scanner;

public class IntNum {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String rnum = s.nextLine();
		
		char[] rchar = new char[rnum.length()];
		String fnum;
		int rrnum = 0;
		boolean b = true;

		rchar[0] = rnum.charAt(0);
		if (rchar[0] == 'I') {

			rrnum += 1;

		} else if (rchar[0] == 'V') {

			rrnum += 5;

		} else if (rchar[0] == 'X') {

			rrnum += 10;

		} else if (rchar[0] == 'L') {

			rrnum += 50;

		} else if (rchar[0] == 'C') {

			rrnum += 100;

		} else if (rchar[0] == 'D') {

			rrnum += 500;

		} else if (rchar[0] == 'M') {

			rrnum += 1000;

		}
		if (rnum.length() > 0) {
			for (int x = 1; x < rnum.length(); x++) {

				rchar[x] = rnum.charAt(x);
				if (rchar[x] == 'I') {

					rrnum += 1;

				} else if (rchar[x] == 'V') {

					rrnum += 5;
					for (int xx = x; xx > 0; xx--) {

						if (rchar[xx - 1] == 'I') {

							rrnum -= 2;

						} else {
							xx = 0;
						}

					}

				} else if (rchar[x] == 'X') {
					rrnum += 10;

					for (int xx = x; xx > 0; xx--) {

						if (rchar[xx - 1] == 'I') {

							rrnum -= 2;

						} else {
							xx = 0;
						}

					}

				} else if (rchar[x] == 'L') {

					rrnum += 50;

					for (int xx = x; xx > 0; xx--) {

						if (rchar[xx - 1] == 'I') {

							rrnum -= 2;

						} else if (rchar[xx - 1] == 'V') {

							rrnum -= 10;

						} else if (rchar[xx - 1] == 'X') {

							rrnum -= 20;

						} else {
							xx = 0;
						}

					}

				} else if (rchar[x] == 'C') {

					rrnum += 100;

					for (int xx = x; xx > 0; xx--) {

						if (rchar[xx - 1] == 'I') {

							rrnum -= 2;

						} else if (rchar[xx - 1] == 'V') {

							rrnum -= 10;

						} else if (rchar[xx - 1] == 'X') {

							rrnum -= 20;

						} else if (rchar[xx - 1] == 'L') {

							rrnum -= 100;

						} else {
							xx = 0;
						}

					}

				} else if (rchar[x] == 'D') {

					rrnum += 500;

					for (int xx = x; xx > 0; xx--) {

						if (rchar[xx - 1] == 'I') {

							rrnum -= 2;

						} else if (rchar[xx - 1] == 'V') {

							rrnum -= 10;

						} else if (rchar[xx - 1] == 'X') {

							rrnum -= 50;

						} else if (rchar[xx - 1] == 'L') {

							rrnum -= 100;

						} else if (rchar[xx - 1] == 'C') {

							rrnum -= 200;

						} else {
							xx = 0;
						}

					}

				} else if (rchar[x] == 'M') {

					rrnum += 1000;

					for (int xx = x; xx > 0; xx--) {

						if (rchar[xx - 1] == 'I') {

							rrnum -= 2;

						} else if (rchar[xx - 1] == 'V') {

							rrnum -= 10;

						} else if (rchar[xx - 1] == 'X') {

							rrnum -= 20;

						} else if (rchar[xx - 1] == 'L') {

							rrnum -= 100;

						} else if (rchar[xx - 1] == 'C') {

							rrnum -= 200;

						} else if (rchar[xx - 1] == 'D') {

							rrnum -= 1000;

						} else {
							xx = 0;
						}

					}

				}

			}
		}
		System.out.println(rrnum);

	}

}
