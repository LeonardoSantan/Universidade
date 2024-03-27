package Atividade1;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float tam = entrada.nextInt();
        int[] vetor = new int[(int) tam];
        for(int i = 0; i<tam; i++){
            vetor[i] = entrada.nextInt();
        }
        retornaMedia(tam,vetor);
    }


    public static void retornaMedia(float tam,int vetor[]){
        int soma = 0;
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        float media = soma / tam;
        System.out.printf("%.2f\n",media);

        for (int i = 0; i < vetor.length; i++){
            if(media < vetor[i]) System.out.println(vetor[i]);
        }
    }
}
