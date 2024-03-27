package Atividade1;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int tam = entrada.nextInt();

        int[] vetor1 = new int [tam];
        int[] vetor2 = new int[tam];

        for(int i = 0; i < tam; i++){
            vetor1[i] = entrada.nextInt();
        }
        for(int i = 0; i < tam; i++){
            vetor2[i] = entrada.nextInt();
        }


        dobraNao(vetor1, vetor2);
    }
//    public static int[] entradaValor(int tam){
//        Scanner entrada = new Scanner(System.in);
//        int[] vetor = new int[tam];
//        for(int i = 0; i < tam; i++){
//            vetor[i] = entrada.nextInt();
//        }
//        return vetor;
//    }
    public static void dobraNao(int[] vetor1, int[] vetor2){

        for(int i = 0; i< vetor1.length; i++){
            for(int j = 0; j < vetor2.length; j++){
                if (vetor1[i] == vetor2[j]) System.out.println(vetor1[i]);
            }
        }
    }
}
