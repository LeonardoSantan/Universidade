
//Declare uma classe chamada Pessoa, contendo:
//
//Atributos:
//        - nome : String.
// - altura : double.
//        - peso : double.
//
//Construtor público 01:
//        - um construtor sem parâmetro que inicia os atributos com os seguintes valores: nome = "Fulano" , altura = 1.80, peso = 80.
//
//Construtor público 02:
//        - um construtor para iniciar com valores todos os atributos, na seguinte ordem: nome, altura, peso.

package AtividadesConstrutores;
public class Atividade2 {
    public static class Pessoa{
        String nome;
        double altura;
        double peso;

        public Pessoa(){
            nome = "Fulano";
            altura = 1.80;
            peso = 80.00;
        }
        public Pessoa(String x, double y, double z){
            nome = x;
            altura = y;
            peso = z;
        }
    }
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Aluno de Poo", 1.60, 90.5);
        System.out.printf("Nome: %s, Altura: %.2f, Peso: %.2f\n", p1.nome, p1.altura, p1. peso);
        System.out.printf("Nome: %s, Altura: %.2f, Peso: %.2f\n", p2.nome, p2.altura, p2. peso);
    }


}

