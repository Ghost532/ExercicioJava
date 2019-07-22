package com.db1.auladb1;

import java.util.Scanner;

public class Matematica {
	
	private double n1;
	private double n2;
	private double n3;
	
	public Matematica (double num1, double num2, double num3) {
		this.n1 = num1;
		this.n2 = num2;
		this.n3 = num3;
	}
	
	public double menorDois() {

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
	
	public double menorTres() {
		if (n1 < n2) {
			System.out.println(n1+ " � menor que " +n2);
		} else {
			System.out.println(n1+ " � maior que " +n2);
		}
		if (n2 < n3) {
			System.out.println(n2+ " � menor que " +n3);
		} else {
			System.out.println(n2+ " � maior que " +n3);
		}
		if (n1 < n3) {
			System.out.println(n1+ " � menor que " +n3);
		} else {
			System.out.println(n1+ " � maior que " +n3);
		}
		
		return 0;
	}
	
	public float media() {
		float calculo = (float) n1, n2, n3;
		System.out.println("A m�dia �:");
		return calculo / 3;		
	}
	
	public int triangulo() {
		
		float base, altura, area;
		
		Scanner valor = new Scanner(System.in); 
		System.out.print("Digite a base do Tri�ngulo: ");
		base = valor.nextFloat();
		System.out.print("Digite a altura do Tri�ngulo: ");	
		altura = valor.nextFloat();
		area = (base * altura ) / 2;
		System.out.println("�rea do Tri�ngulo = "+ area);
		return 0;
		
	}
}
