
import java.util.Arrays;
import java.util.Scanner;

public class EXERCICIO_01 {
    public static void main(String[] args) {
        
        Scanner leitorT = new Scanner(System.in);
        int vetor[] = null;
        boolean  vetorCriado = false;
        int opcao;
        
        do { // do while usado para repetir  o menu de opcoes 

            System.out.print("*********** Menu de opções");
            System.out.print("");
            System.out.print("  [1] - Criação e armazenamento do vetor\n");
            System.out.print("  [2] - Atualização do vetor\n");
            System.out.print("  [3] - Listagem do Vetor\n");
            System.out.print("  [4] - Cálculo da probabilidade de um número par\n");
            System.out.print("  [5] - Cálculo da probabilidade de um número ímpar");
            System.out.print("  [6] - Calcular fatorial dos elementos do vetor");
            System.out.print("  [7] - Sair do programa");
            
             opcao = Integer.parseInt(leitorT.nextLine());
            
            switch( opcao ){
                 case 1:
                        
                if( vetorCriado  ){ // caso o vetor ja tenha sido criado executara esse if
                        System.out.println("O vetor já foi criado anteriormente!");
                        break;
                } else {
                          System.out.print("********* Criação e armazenamento de vetor");
                    
                    int tamanhoVetor; 
                           
                          System.out.println("Digite tamanho do vetor:");
                    
                          tamanhoVetor= Integer.parseInt(leitorT.nextLine());
                    
                          vetor = new  int[tamanhoVetor];
                    for( int i = 0; i < vetor.length; i++){
                        
                          System.out.println("  Digite" + (i +1) + "º posição: ");
                          vetor[i] = Integer.parseInt(leitorT.nextLine());
                    } 
                          System.out.print("Preenchimento realizado com sucesso!");
                          vetorCriado = true; // necessario para executar o for, pois esta informando que o vetor foi criado.
                          break;
                }
                     case 2:
                          System.out.println("********* Atualização do vetor");
                if(!vetorCriado){ // se o vetor nao existir, mostrara uma mensagem 
                           System.out.println("  O vetor ainda não foi criado!");
                           break;
                }else{ // se o vetor ja estiver criado ele atualiza os valores
                    for( int i = 0; i < vetor.length; i++){
                          System.out.println("Digite "+ (i+1)+"º posição:");
                          vetor[i] = Integer.parseInt(leitorT.nextLine());
                    }
                          System.out.println("Atualização realizada com sucesso!");
                }         break;
                   case 3:
                          System.out.println("********* Listagem do vetor");
                    if( !vetorCriado){
                            System.out.println("O vetor ainda não foi criado!");
                            break;
                    }else {
                            System.out.println( "vetor atual:"+ Arrays.toString(vetor));// array usado para deixar a saida  com colchete e virgula. ex [ 2,4]
                            
                          } 
                            System.out.println("Listagem realizada com sucesso!");
                    break;
                    case 4:
                     System.out.print("********* Cálculo da probabilidade de um número par\n");
                    if( !vetorCriado){
                            System.out.println("O vetor ainda não foi criado!");
                            break;
                    } 
                    int pares = 0;
                    for( int i =0; i < vetor.length; i++){
                            if(vetor[i] %2 ==0){// esta contando quantos numeros  sao pares
                                    pares++;
                            }
                    }
                            double   probabilidade = ( (double)pares  /vetor.length) * 100; 
                            System.out.println("Probabilidade de ser par:"+ probabilidade + "%\n");
                            System.out.print("Cálculo da probabilidade realizada com sucesso!\n");
                            break;
                    case 5:
                            System.out.print("********* Cálculo da probabilidade de um número ímpar");
                    if( !vetorCriado){
                            System.out.println("O vetor ainda não foi criado!");
                            break;
                          }  
                      int impar = 0;
                       for( int i =0; i < vetor.length; i++){
                            if(vetor[i] %2 !=0){// esta contando quantos numeros  sao pares
                                    impar++;
                            }
                    }
                            double   probabilidadeImpar = ( (double)impar  /vetor.length) * 100; 
                            System.out.println("Probabilidade de ser impar:"+ probabilidadeImpar + "%\n");
                            System.out.print("Cálculo da probabilidade realizada com sucesso!\n");
                            break;
                    case 6: 
    System.out.println("********* Cálculo dos fatoriais");
    if (!vetorCriado) {
        System.out.println("O vetor ainda não foi criado!");
        break;
    }

    for (int i = 0; i < vetor.length; i++) {

        int valor = vetor[i];

        if (valor < 0) {
            System.out.println(valor + "! não existe");
            continue;
        }

        if (valor == 0 || valor == 1) {
            System.out.println(valor + "! = 1");
            continue;
        }

        long fatorial = 1;
        String conta = "";

        for (int j = valor; j >= 1; j--) {
            fatorial = fatorial * j;   // cálculo correto
            conta = conta + j;         // monta string

            if (j > 1)
                conta = conta + " * ";
        }

        System.out.println(valor + "! = " + conta + " = " + fatorial);
    }

    break;
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
            }
    } while (opcao !=7 );{
            System.out.print(" saiu do programa.");
        }
    }
}