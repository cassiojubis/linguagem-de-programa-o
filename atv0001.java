package cassio;
import java.util.Scanner;
public class atv0001 {

	public static void main(String[] args) {
			Scanner leitorT = new Scanner (System.in);
			 		System.out.printf("**** Sisteminha de vetores");
			 		System.out.println("\n Quantos alunos tem na sala?");	
			 				int qtdAluno = leitorT.nextInt();
			 				leitorT.nextLine(); // necessario para limpar o enter que ficou no buffer
			 				String[] aluno = new String[qtdAluno];	 //vetor do tipo aluno
				 				double[] notaT1 = new double [qtdAluno];	//vetor trabalho
				 				double[] notaT2 = new double [qtdAluno];	//vetor trabalho
				 				double[] notaP = new double [qtdAluno];	//vetor prova
			 	 
			 	 
				for(int i = 0;i< aluno.length ;i++) {
						System.out.printf("**** Fase da digitação");
						System.out.printf("\n**** Dados do aluno " + i) ;
						System.out.println("\n    Digite o nome do aluno....:");
							aluno[i] = leitorT.nextLine();
						System.out.println("\n    Digite nota do trabalho 1.:");
							notaT1[i] = leitorT.nextDouble();
						System.out.println("\n    Digite nota do trabalho 2.:");
							notaT2[i] = leitorT.nextDouble();
						System.out.println("\n    Digite nota da prova......:");
							notaP[i] = leitorT.nextDouble();
							leitorT.nextLine();
					}
					for(int i = 0;i< aluno.length ;i++) {
						double mediaF = (((notaT1[i] + notaT2[i])/ 2)+notaP[i])/2; // o i  indica o indice do vetor, sem ele nao funcionara essa linha
						System.out.printf(" **** Fase do relatório");
						System.out.println("\n **** Dados do aluno"+i );
						System.out.println("\n    Aluno.....................:"+aluno[i]);
						System.out.println("    Digite nota do trabalho 1.:"+notaT1[i]);
						System.out.println("    Digite nota do trabalho 2.:"+notaT2[i]);	
						System.out.println("    Digite nota da prova......:" +notaP[i] );
						System.out.println("    Nota total................: " + mediaF);
							
							
					if ( mediaF >= 60.0) {
						 System.out.println("   Situação..................: Aprovado");
						 
					}else {
						 System.out.println("   Situação..................: Reprovado");
					}
					
				}
			}
	}
