package Atividade1;
import java.util.Scanner;
public class Atividade6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String string;
        String mensagemFim = "FIM";
        int a=0, e=0, i=0, o=0, u=0;
        char cha;
        do {
            string = entrada.nextLine();
            string = string.toUpperCase();
            for (int j = 0; j < string.length(); j++) {
                cha = string.charAt(j);
                cha = Character.toUpperCase(cha);
                if(cha == 'A') a++;
                if(cha == 'E') e++;
                if(cha == 'I') i++;
                if(cha == 'O') o++;
                if(cha == 'U') u++;
            }
        }
        while(!string.equals(mensagemFim));
        System.out.println("a=" + a);
        System.out.println("e=" + e);
        System.out.println("i=" + i);
        System.out.println("o=" + o);
        System.out.println("u=" + u);
    }
}
