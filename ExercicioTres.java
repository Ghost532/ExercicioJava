package com.db1.auladb1;

public class ExercicioTres {
	public static double menorDois (double n1, double n2) {

		if (Double.compare(n1, n2) > 0) {
			System.out.println(n1+ " � maior que " +n2);
			}
		else if (Double.compare(n1, n2) == 0) {
				System.out.println("Os dois s�o iguais");
			}
		else {
				System.out.println(n1+ " � menor que " +n2);
			};
		return 0;
	}
		
	public static double menorTres (double m1, double m2, double m3) {
		
		if (m1 < m2) {
			System.out.println(m1+ " � menor que " +m2);
		} else {
			System.out.println(m1+ " � maior que " +m2);
		}
		if (m2 < m3) {
			System.out.println(m2+ " � menor que " +m3);
		} else {
			System.out.println(m2+ " � maior que " +m3);
		}
		if (m1 < m3) {
			System.out.println(m1+ " � menor que " +m3);
		} else {
			System.out.println(m1+ " � maior que " +m3);
		}
		
		return void;
	}
	
	}

