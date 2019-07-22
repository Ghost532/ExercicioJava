package com.db1.auladb1;

public class Calculadora {
	
	private int numero1;
	private int numero2;
	
	public Calculadora (int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public int somar() {
		return numero1 + numero2;
	}
	
	public int subtrair() {
		return numero1 - numero2;
	}
	
	public  int multiplicacao() {
		return numero1 * numero2;
	}
	
	public int divisao() {
		return numero1 / numero2;
	}
	
	public int par() {
		if(numero1 % 2 == 0) {
			System.out.println(numero1+ " é par");
		} else System.out.println(numero1+ " é impar"); 
		if(numero2 % 2 == 0) {
			System.out.println(numero2+ " é par");
		} else  System.out.println(numero2+ " é impar");
		
		return 0;
	}
	
	public int maior() {
		if (numero1 > numero2) {
			System.out.println(numero1+ " é maior que " +numero2);
		} else System.out.println(numero1+ " é menor que " +numero2);
			return 0;
	}
	
	public int impar() {
		int contador = 0;
		 for (int i = numero1; i <= 100; i++) {
			if (i % 2 != 0) {
				contador++;
			}
			System.out.println("A quantidade de números ímpares é: " +contador);
		}		 
		 return 0;
	}
	
	}