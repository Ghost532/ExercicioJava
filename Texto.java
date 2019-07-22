package com.db1.auladb1;

import java.util.*;

public class Texto {
	
	private String text;
	private String nome;
	private String lastname;
	
	public Texto (String texto) {
		this.text = texto;
		this.nome = nome;
		this.lastname = lastname;
		
	}

	public String textoMaiusculo() {
		
		String maiusculo = this.text.toUpperCase();
		return maiusculo;

	}
	
	public String textoMinusculo() {
		String minusculo = this.text.toLowerCase();
		return minusculo;
	}
	
	public int qtdcaracteres() {
		return this.text.length();
	}
	
	public int qtdespaco() {
		String texto = " DB1 ";
		return texto.length();
	}
	public int qtdsem() {
		String texto = " DB1 ";
		return (texto.replace(" ", "").length());
	}
	
	public String nome() {
		Scanner name = new Scanner (System.in);
		System.out.print("Digite seu nome: ");
		nome = name.nextLine();
		if (nome.length() > 4) {
	          
	     }
		return nome.substring(0, 4) + "...";
	}
	
	public String nomeDois() {
		Scanner name = new Scanner (System.in);
		System.out.print("Digite seu nome: ");
		nome = name.nextLine();
		if (nome.length() < 1) {
	          
	     }
		return nome.substring(3, nome.length()) + "...";
	}
	public String nomeTres() {
		Scanner name = new Scanner (System.in);
		System.out.print("Digite seu nome: ");
		nome = name.nextLine();
		if (nome.length() > 0) {
	          
	     }
		return nome.substring(nome.length() - 4) + "...";
	}
	
	public String replace() {
		Scanner name = new Scanner (System.in);
		System.out.print("Digite seu nome: ");
		nome = name.nextLine().replaceAll(nome, "ALUNO/ALUNA");
		System.out.print("Digite seu sobrenome: ");
		lastname = name.nextLine();
		return nome+ " " +lastname;
	}
	
	public String fruta() {
		String frutas;
		Scanner fruta = new Scanner (System.in);
		System.out.print("Digite o nome de três frutas: ");
		frutas = fruta.nextLine().replaceAll(",", " ");
		return frutas;
	}
	
	public String vogais() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite algo aqui: ");
		
		String texto = scan.nextLine();
		int countadorVogais = 0;
        for (int i = 0; i < texto.length(); i++)
        {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u' ||
                texto.charAt(i) == 'A' || texto.charAt(i) == 'E' || texto.charAt(i) == 'I' || texto.charAt(i) == 'O' || texto.charAt(i) == 'U')
            {
                countadorVogais++;
            }
        }
        return countadorVogais+ " vogais";  
	}
	
	public String reverso() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite algo aqui: ");
		String str = scan.nextLine();
		String reverse = "";
        scan.close();
        
        for(int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
        
}
}
