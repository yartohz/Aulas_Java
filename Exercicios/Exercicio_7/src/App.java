import java.util.Scanner;
import java.util.ArrayList;
import src.Metodos;
package pacote;

public class App {
    private static final Scanner sc = new Scanner(System.in);

    public static void verificaPares(int[]numeros,int alvo) {
        int quantidadePares = 0;
        
        for(int i = 0; i < numeros.length; i++ ){
           for (int j = i + 1; j < numeros.length ; j++) {
                if (numeros[i]+numeros[j]==alvo) {

                    if(quantidadePares==0){
                        System.out.println("Pares que foram encontrados!");
                    }
                    else{ 
                        System.out.println("Pares que foram encontrados!");

                        System.out.println("Primeiro Valor"+ numeros[i]+ "| Índice"+ (i+1));
                        System.out.println("Segundo Valor"+ numeros[i]+ "| Índice"+ (j+1));
                    
                        System.out.println(" ");

                        System.out.println("A soma dos Valores "+ (numeros[i]+numeros[j]));
                    }
                    quantidadePares ++;
                }
            }
        }
        if (quantidadePares==1) {}
        else if (quantidadePares>1) {
            System.out.println("quantidade de pares que a soma é o igual ao valor alvo :");

                
            }


        else {System.out.println("quantidade de pares que a soma é o igual ao valor alvo não foram encontrados :");}

        }

    

    public static void main(String[] args) throws Exception {
        ArrayList<Participante> lista = new ArrayList<>();
        ArrayList<Participante> lista = new ArrayList<>();
        ArrayList<Participante> lista = new ArrayList<>();
        ArrayList<Participante> lista = new ArrayList<>();
        ArrayList<Participante> lista = new ArrayList<>();






        System.out.println("Quantos números você  gostaria de digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for(int i=0; i< numeros.length; i++){
            System.out.println("Informe o número da posição " + (i+1) + ":");
            numeros[i] = sc.nextInt();
        }
        System.out.println("    ");
    }
}
