
//Atributos:
//nome : String, idade : int, genero : char, ra : long
//
//Construtores:
//construtor 1 - sem parâmetros, mas deve atribuir valores padrão para todos os atributos da classe (valores padrão: "Aluno", 18, 'M', 123456789).
//construtor 2 - com parâmetros para atribuir valores aos atributos nome e idade.
//construtor 3 - com parâmetros para atribuir valores aos atributos nome, genero e ra.
//Quando o construtor não define o valor de um atributo, você deve usar o valor padrão informado no construtor 1.

package AtividadesConstrutores;
public class Atividade1 {
    public static class Aluno{
        String nome;
        int idade;
        char genero;
        long ra;

        public Aluno(){
            nome = "Aluno";
            idade = 18;
            genero = 'M';
            ra = 123456789;
        }
        public Aluno(String x, int y){
            nome = x;
            idade = y;
            genero = 'M';
            ra = 123456789;
        }
        public Aluno (String x, char y, long z){
            nome = x;
            idade = 18;
            genero = y;
            ra = z;
        }
        public void print(){
            System.out.println(nome + " - " + idade + " - " + genero + " - " + ra);
        }
    }

    public static void main(String[] args){
        Aluno a1 = new Aluno();
        a1.print();

        Aluno a2 = new Aluno("Fulana", 'F', 20232323);
        a2.print();

        Aluno a3 = new Aluno("Ciclano da Silva", 34);
        a3.print();
    }

}

