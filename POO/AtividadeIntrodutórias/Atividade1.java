package Atividade1;

public class Atividade1 {
    public static void main(String[] args){

        double n = maior(1, 2, 3, 4);
        System.out.printf("%.1f", n);
    }


    public static double maior(int a, int b, int c, int d){
        double[] conjunto = {a, b, c, d};
        double maiorValor = a;

        for(int i = 0;i < 4; i++){
            if (maiorValor < conjunto[i]) maiorValor = conjunto[i];
        }
        return maiorValor;
    }
}
