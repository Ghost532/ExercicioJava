package com.db1.auladb1;
import java.util.*;

public class App {
	
	public static void main (String[] args ) {
		
//		//Exercício de Inteiro (Integer)
//		
//		System.out.println("_______________________________________________________________________ \n");
		
//		System.out.println("                    || Exercícios de Inteiro (Integer)|| \n");
		
//		System.out.println("_______________________________________________________________________ \n");
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Digite um número: ");
//		int num = scan.nextInt();
//		System.out.print("Digite um segundo numero: ");
//		Scanner scan1 = new Scanner(System.in);
//		int num2 = scan1.nextInt();
//		int soma = ExercicioUm.adicao(num, num2);
//		int sub = ExercicioUm.subtracao(num, num2);
//		System.out.println("A soma de " +num+ " com " +num2+ " é: " + soma);
//		System.out.println("A subtração de " +num+ " com " +num2+ " é: " + sub);
//		
//		//Exercício de Texto (String)
//		
//		System.out.println("_______________________________________________________________________ \n");
		
//		System.out.println("                    || Exercícios de Texto (String) || \n");
		
//		System.out.println("_______________________________________________________________________ \n");
//		Scanner scanT = new Scanner (System.in);
//		System.out.print("Digite algo aqui: ");
//		String texto = scanT.next();
//		String textoM = ExercicioDois.Maiusculo(texto);
//		String textom = ExercicioDois.Minusculo(texto);
//		System.out.println("Em maisculo: " +textoM);
//		System.out.println("Em minusculo: " +textom);
//		
//		//Exercício de Matematica (Double)
//		
//		System.out.println("_______________________________________________________________________ \n");
		
//		System.out.println("                    || Exercícios de Matemática (Double)|| \n");
		
//		System.out.println("_______________________________________________________________________ \n");
//		
//		Scanner scanN1 = new Scanner (System.in);
//		System.out.print("Digite um valor: ");
//		double n1 = scanN1.nextDouble();
//		Scanner scanN2 = new Scanner (System.in);
//		System.out.print("Digite um segundo valor: ");
//		double n2 = scanN2.nextDouble();
//		double compN = ExercicioTres.menorDois(n1, n2);
//		System.out.println(compN);
//		
//		System.out.println("----------------------------------------------------------------------- \n");
//		
//		Scanner scanM1 = new Scanner (System.in);
//		System.out.print("Digite um valor: ");
//		double m1 = scanM1.nextDouble();
//		Scanner scanM2 = new Scanner (System.in);
//		System.out.print("Digite um segundo valor: ");
//		double m2 = scanM2.nextDouble();
//		Scanner scanM3 = new Scanner (System.in);
//		System.out.print("Digite um terceiro valor: ");
//		double m3 = scanM3.nextDouble();
//		double compM = ExercicioTres.menorTres(m1, m2, m3);
//		System.out.println(compM);
		
		System.out.println("\n_______________________________________________________________________ \n");
		
		System.out.println("                    || Exercícios de Inteiro || \n");
		
		System.out.println("_______________________________________________________________________ \n");
		
		
		Calculadora calculadora = new Calculadora(97, 100);
		System.out.println(calculadora.somar());
		System.out.println(calculadora.subtrair());
		
		System.out.println(calculadora.par());
		System.out.println("\n----------------------------------------------------------------------- \n");
		System.out.println(calculadora.maior());
		System.out.println("\n----------------------------------------------------------------------- \n");
		System.out.println(calculadora.impar());
		
		
		System.out.println("\n_______________________________________________________________________ \n");
		
		System.out.println("                    || Exercícios de Texto || \n");
		
		System.out.println("_______________________________________________________________________ \n");
		

		
		System.out.println("\n_______________________________________________________________________ \n");
		
		System.out.println("                    || Exercícios de Matemática || \n");
		
		System.out.println("_______________________________________________________________________ \n");
		
		
		Matematica matematica = new Matematica(80, 50, 60);
		System.out.println(matematica.menorDois());
		System.out.println("\n----------------------------------------------------------------------- \n");
		System.out.println(matematica.menorTres());
		System.out.println("\n----------------------------------------------------------------------- \n");
		System.out.println(matematica.media());
		System.out.println("\n----------------------------------------------------------------------- \n");
		System.out.println(matematica.triangulo());
		System.out.println("\n----------------------------------------------------------------------- \n");
		
}
	
}
