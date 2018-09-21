package CCC;
import java.util.Scanner;

public class CCC_2010_J3 {

	public static void main(String[] args) {
		Scanner sc;
		Scanner scc = new Scanner(System.in);
		int n = 0;
		int nn = 0;
		int a = 0, b = 0;
		char c, d;
		String s = "";
		int x = 0, y = 0;

		do {
			s = scc.next();
			n = Integer.parseInt(s);

			switch (n) {

			case 1:
				s = scc.next();
				c = s.charAt(0);
				c = Character.toUpperCase(c);
				s = scc.next();
				nn = Integer.parseInt(s);
				if (c == 'A') {
					a = nn;
				} else {
					b = nn;
				}
				break;
			case 2:
				s = scc.next();
				c = s.charAt(0);
				c = Character.toUpperCase(c);
				if (c == 'A') {
					System.out.println(a);
				}else {
					System.out.println(b);
				}
				break;
			case 3:
				s = scc.next();
				c = s.charAt(0);
				c = Character.toUpperCase(c);
				s = scc.next();
				d = s.charAt(0);
				d = Character.toUpperCase(d);
				x = 0;
				y = 0;
				if (c == 'A') {
					x = a;
				} else {
					x = b;
				}
				if (d == 'B') {
					y = b;
				} else {
					y = a;
				}
				if (c == 'A') {
					a = x + y;
				} else {
					b = x + y;
				}
				break;
			case 4:
				s = scc.next();
				c = s.charAt(0);
				c = Character.toUpperCase(c);
				s = scc.next();
				d = s.charAt(0);
				d = Character.toUpperCase(d);
				x = 0;
				y = 0;
				if (c == 'A') {
					x = a;
				} else {
					x = b;
				}
				if (d == 'B') {
					y = b;
				} else {
					y = a;
				}
				if (c == 'A') {
					a = x * y;
				} else {
					b = x * y;
				}
				break;
			case 5:
				s = scc.next();
				c = s.charAt(0);
				c = Character.toUpperCase(c);
				s = scc.next();
				d = s.charAt(0);
				d = Character.toUpperCase(d);
				x = 0;
				y = 0;
				if (c == 'A') {
					x = a;
				} else {
					x = b;
				}
				if (d == 'B') {
					y = b;
				} else {
					y = a;
				}
				if (c == 'A') {
					a = x - y;
				} else {
					b = x - y;
				}
				break;
			case 6:
				s = scc.next();
				c = s.charAt(0);
				c = Character.toUpperCase(c);
				s = scc.next();
				d = s.charAt(0);
				d = Character.toUpperCase(d);
				x = 0;
				y = 0;
				if (c == 'A') {
					x = a;
				} else {
					x = b;
				}
				if (d == 'B') {
					y = b;
				} else {
					y = a;
				}
				if (c == 'A') {
					a = x / y;
				} else {
					b = x / y;
				}
				break;
			case 7:
				break;
			}

		} while (n != 7);

	}

}
