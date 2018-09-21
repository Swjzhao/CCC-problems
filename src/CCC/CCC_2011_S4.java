package CCC;
import java.util.Scanner;

public class CCC_2011_S4 {

	public static int max = Integer.MIN_VALUE;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// Units
		int On = s.nextInt();
		int Op = s.nextInt();
		int An = s.nextInt();
		int Ap = s.nextInt();
		int Bn = s.nextInt();
		int Bp = s.nextInt();
		int ABn = s.nextInt();
		int ABp = s.nextInt();
		// Patients
		int pOn = s.nextInt();
		int pOp = s.nextInt();
		int pAn = s.nextInt();
		int pAp = s.nextInt();
		int pBn = s.nextInt();
		int pBp = s.nextInt();
		int pABn = s.nextInt();
		int pABp = s.nextInt();

		int[] units = { On, Op, An, Ap, Bn, Bp, ABn, ABp };

		int[] patients = { pOn, pOp, pAn, pAp, pBn, pBp, pABn, pABp };
		getMax(units, units, patients, 0, 0);

		System.out.println(max);
	}

	public static void getMax(int[] u, int[] ou, int[] p, int c, int m) {

		// 5 5 3 1 2 11 5 12 2 4 9 2 3 9 7 3
		//case 0 OK;
		//case 1, 2, 3 may be still wrong
		
		System.out.println(m + ":" + c);

		if (c == 8) {

			if (m > max) {

				max = m;
			}
			return;
		} else {

			switch (c / 2) {

			case 0:
				if (c % 2 == 0) {
					if (u[c] < p[c]) {

						m += u[c];
						u[c] -= ou[c];
						getMax(u, ou, p, c + 1, m);
						u[c] += ou[c];
						m -= u[c];
					} else {
						m += p[c];
						u[c] -= p[c];
						getMax(u, ou, p, c + 1, m);
						u[c] += p[c];
						m -= p[c];
					}
				} else {
					
					if(u[c-1] + u[c] < p[c]){
						m+= u[c-1] + u[c];
						u[c-1] = 0;
						u[c] = 0;
						getMax(u,ou,p,c+1,m);
						u[c-1] = ou[c-1];
						u[c] = ou[c];
						m -= u[c-1] + u[c];
						
					}else{
						m += p[c];
						if(p[c] < u[c]){
							u[c] -= p[c];
							getMax(u,ou,p,c+1,m);
							u[c] += p[c];
						}else if(p[c] < u[c] + u[c-1]){
							u[c-1] -= p[c] - u[c];
							int t = u[c];
							u[c] = 0;
							getMax(u,ou,p,c+1,m);
							u[c] = t;
							u[c-1] += p[c] - u[c]; 
						}
						
						
						m -= p[c];
					}
				}	
				

				break;
			case 1:
				if (c % 2 == 0) {
					if (u[c] + u[0] < p[c]) {
						m += u[c] + u[0];
						int t = u[0];
						u[c] = 0;
						u[0] = 0;
						getMax(u, ou, p, c + 1, m);
						u[c] += ou[c];
						u[0] = t;
						m -= u[c];
					} else {
						m += p[c];	
						if(p[c] < u[c]){
							u[c] -= p[c];
							getMax(u,ou,p,c+1,m);
							u[c] += p[c];
						}else if(p[c] < u[c] + u[0]){
							u[0] -= p[c] - u[c];
							int t = u[c];
							u[c] = 0;
							getMax(u,ou,p,c+1,m);
							u[c] = t;
							u[0] += p[c] - u[c]; 
						}
					
						getMax(u, ou, p, c + 1, m);
					
						m -= p[c];
					}
				} else {
					if (u[0] + u[1] + u[c - 1] + u[c] < p[c]) {
						m += u[c - 1] + u[c] + u[0] + u[1];
						
						int t = u[c-1];
						int tt = u[0];
						int ttt = u[1];
						
						u[c-1] = 0;
						u[c] = 0;
						u[0] = 0;
						u[1] = 0;
						getMax(u, ou, p, c + 1, m);
						u[c] = ou[c];
						u[c- 1] = t;
						u[0] = tt;
						u[1] = ttt;
						
						m -=  u[c - 1] + u[c] + u[0] + u[1];
						//below still wrong maybe
					} else {
						m += p[c];
						int t = ou[c - 1];
						u[c - 1] -= ou[c - 1];
						u[c] -= ou[c];
						getMax(u, ou, p, c + 1, m);

						u[c - 1] += t;
						u[c] += ou[c];
						m -= p[c];

					}
				}
				break;
			case 2:
				if (c % 2 == 0) {
					if (u[c] < p[c]) {
						m += u[c];
						u[c] -= ou[c];
						getMax(u, ou, p, c + 1, m);
						u[c] += ou[c];
						m -= u[c];
					} else {
						m += p[c];
						u[c] -= p[c];
						getMax(u, ou, p, c + 1, m);
						u[c] += p[c];
						m -= p[c];
					}
				} else {
					if (u[c - 1] + u[c] < p[c]) {
						m += u[c - 1] + u[c];
						int t = ou[c - 1];
						u[c] -= p[c] - u[c - 1];
						u[c - 1] -= ou[c - 1];
						getMax(u, ou, p, c + 1, m);

						u[c - 1] += t;
						u[c] += p[c] - u[c - 1];
						m -= u[c - 1] + u[c];
					} else {
						m += p[c];
						int t = ou[c - 1];
						u[c - 1] -= ou[c - 1];
						u[c] -= ou[c];
						getMax(u, ou, p, c + 1, m);

						u[c - 1] += t;
						u[c] += ou[c];
						m -= p[c];

					}
				}
				break;
			case 3:
				if (c % 2 == 0) {
					if (u[c] < p[c]) {
						m += u[c];
						u[c] -= ou[c];
						getMax(u, ou, p, c + 1, m);
						u[c] += ou[c];
						m -= u[c];
					} else {
						m += p[c];
						u[c] -= p[c];
						getMax(u, ou, p, c + 1, m);
						u[c] += p[c];
						m -= p[c];
					}
				} else {
					if (u[c - 1] + u[c] < p[c]) {
						m += u[c - 1] + u[c];
						int t = ou[c - 1];
						u[c] -= p[c] - u[c - 1];
						u[c - 1] -= ou[c - 1];
						getMax(u, ou, p, c + 1, m);

						u[c - 1] += t;
						u[c] += p[c] - u[c - 1];
						m -= u[c - 1] + u[c];
					} else {
						m += p[c];
						int t = ou[c - 1];
						u[c - 1] -= ou[c - 1];
						u[c] -= ou[c];
						getMax(u, ou, p, c + 1, m);

						u[c - 1] += t;
						u[c] += ou[c];
						m -= p[c];

					}
				}
				break;

			}

		}

	}

}
