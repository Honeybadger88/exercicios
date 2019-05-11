package aula13;

import java.util.Scanner;

public class startapp {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		int [] notas = new int [25];
		int menor=0,posicao=0;
		for (int i=0;i<25; i++) {
			System.out.println("digite a nota: ");
			int nota = scanner.nextInt();
			scanner.nextLine();
			notas [i] = nota;
			menor = notas[0];
			if (notas[i]<menor) {
				menor=notas[i];
				posicao=i;
			}
			
		}
		//System.out.println("6 nota digitada= " +notas[5]);
		//System.out.println("21 nota digitada= "+ notas[20]);
		System.out.println("posicao da menor nota é "+posicao);
		System.out.println("tamanho do array" +notas.length);
		System.out.println("menor numero "+menor);
		for (int j=0;j<25;j++) {
			System.out.println(notas[j]);
		
			}
			
			
		}
		
	}


