package ryanoliveira;

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Questão02 {
	public static void main(String[] args) {
		Locale brasil = new Locale("pt", "BR");
		new DecimalFormat();
		Scanner leitorT = new Scanner(System.in);

		int QtdA;

		System.out.println("Qual a quantidade de alunos na sala? ");
		QtdA = leitorT.nextInt();
		leitorT.nextLine();

		String[] nomes = new String[QtdA];
		double[][][] notas = new double[QtdA][4][5];
		double[][][] media = new double[QtdA][4][3];

		System.out.println("************* Digite alunos da turma de lógica \n");

		for (int i = 0; i < QtdA; i++) {
			System.out.print("Nome do aluno " + (i + 1) + "....: ");
			nomes[i] = leitorT.nextLine();
		}

		for (int b = 0; b < 4; b++) {
			System.out.println("************* Notas do " + (b + 1) + "º Bimestre");

			for (int i = 0; i < QtdA; i++) {
				System.out.println("");
				System.out.println("Nome do aluno " + (i + 1) + "....: " + nomes[i]);

				System.out.println("Nota do trabalho 1.: ");
				notas[i][b][0] = leitorT.nextDouble();
				System.out.println("Nota do trabalho 2.:");
				notas[i][b][1] = leitorT.nextDouble();
				System.out.println("Nota do trabalho 3.:");
				notas[i][b][2] = leitorT.nextDouble();
				System.out.println("Nota da avaliação 1:");
				notas[i][b][3] = leitorT.nextDouble();
				System.out.println("Nota da avaliação 2: ");
				notas[i][b][4] = leitorT.nextDouble();

				double mediaBimestre = ((((notas[i][b][0] + notas[i][b][1] + notas[i][b][2]) / 3)
						+ ((notas[i][b][3] + notas[i][b][4]) / 2)) / 2);
				//System.out.println("Nota do 1º bimestre: " + mediaBimestre);
				
				System.out.printf("Nota do %dº bimestre: %.2f\n", (b+1), mediaBimestre);

				if (mediaBimestre >= 60) {
					System.out.println("Situação...........: APROVADO NO " + (b + 1) + "º BIMESTRE ");
					System.out.println();

				} else if (mediaBimestre < 60) {
					System.out.println("Situação...........: DESAPROVADO NO " + (b + 1) + "º BIMESTRE ");
					System.out.println();
				}
				
				
					
				
	
			}
		}
				System.out.print("************* Relatório sintético final dos alunos de Lógica de Programação");
		
					for(int i = 0; i < QtdA; i++) {
							System.out.println("Nome do aluno " + (i+1)+"...............:"+nomes[i]);
							double mediaAno =
		}

	}

}
