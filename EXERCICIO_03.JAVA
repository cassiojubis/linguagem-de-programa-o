import java.util.arrays;
import java.util.Scanner;
     public class EXERCICIO_03{
        public static void main(String[] args) {
            Scanner leitorT = new Scanner(System.in);
            int   matriz[][][] =  new int [2][][]; //vetor tridimensional nulo
            boolean matrizCriada = false;
            int opcao;

            do{

               System.out.print("*********** Menu de opções - Matrizes Unidimensionais");
               System.out.print("  [1] - Criação e armazenamento de matrizes\n");
               System.out.print("  [2] - Atualização de matrizes\n");
               System.out.print("  [3] - Listagem de matrizes\n");
               System.out.print("  [4] - Soma de matrizes\n");
               System.out.print("  [5] - Subtração de matrizes\n");
               System.out.print("  [6] - Multiplicação de matrizes\n");
               System.out.print("  [7] - Sair do programa\n");

                opcao = Integer.parseInt(leitorT.nextLine());

            switch(opcao){
                 case 1:
                         System.out.println("********* Criação e armazenamento de matrizes");
                 if(matrizCriada){
                            System.out.println("Matrizes já foram criadas anteriormente!");
                            break;
                     }else{
                        int matrizColunas,matrizLinhas;
                            System.out.println("Digite número de linhas da matriz.:")
                            matrizLinhas = Integer.parseInt(leitorT.nextLine());

                            System.out.println("Digite número de colunas da matriz.:")
                            matrizColunas = Integer.parseInt(leitorT.nextLine());

                        matriz = new int[2][matrizLinhas][matrizColunas];
                for(int i = 0; i < 2; i++){
                    for(int j = 0; i < matrizLinhas;j++){
                        for(int k = 0; k < matrizColunas;k++){
                            System.out.print("Preenchimento da matriz 0"+(i+1)+":\n");
                            System.out.print("Digite linha"+  j +"e coluna "+ k+":\n");


                            }
                            
                        }
                        }
                 
                 
                       }
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                    }






            }while(opcao != 7);{
                System.out.print(" saiu do programa.");
            }






}
        }