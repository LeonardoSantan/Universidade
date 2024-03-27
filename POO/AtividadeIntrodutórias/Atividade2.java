package Atividade1;

public class Atividade2 {
    public static void main(String[] args){

        int vetor[] = {1,-2,3,4,-5,6,-7};
        int maior = procuraMaiorValor(vetor);
        System.out.println(maior);
    }


    public static int procuraMaiorValor(int vetor[]){
        int maiorValor = vetor[0];
        for(int i = 0;i < vetor.length; i++){
            if (maiorValor < vetor[i]) maiorValor = vetor[i];
        }
        return maiorValor;
    }
}
