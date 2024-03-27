package Atividade1;
import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String texto1 = entrada.nextLine();
        String pesquisa = entrada.nextLine();

        int contador=0;
        int index = texto1.indexOf(pesquisa);
        while(index != -1){
            contador++;
            index = texto1.indexOf(pesquisa, index+1);
        }
        System.out.println(pesquisa+"="+contador);
    }
}