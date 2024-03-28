
//Atributos:
//- nome : String.
// - altura : double.
//- peso : double.
//
//Construtor público 01:
//- um construtor sem parâmetro que inicia os atributos com os seguintes valores: nome = "Fulano" , altura = 1.80, peso = 80.
//
//Construtor público 02:
//- um construtor para iniciar com valores todos os atributos, na seguinte ordem: nome, altura, peso.
//Método para calcularIMC:
//declare um médodo público para calcular o IMC (Índice de Massa Corporal) da pessoa.
//- o método deve utilizar os valores dos atributos da Pessoa para realizar o cálculo.
//- o método deve retornar o valor do IMC como um double.


package AtividadesConstrutores;
    public class Atividade3 {
        public static class Pessoa{
            String nome;
            double altura;
            double peso;

            public Pessoa(){
                nome = "Fulano";
                altura = 1.80;
                peso = 80;

            }
            public Pessoa(String x, double y, double z){
                nome = x;
                altura = y;
                peso = z;
            }
            public double calcularIMC(){
                double imc = peso / (altura*altura);
                return imc;
            }
    }

    public static void main(String[] args){
        Pessoa p1 = new Pessoa("Aluno de Poo", 1.80, 75);
        System.out.printf("Nome: %s, Altura: %.2f, Peso: %.2f\n", p1.nome, p1.altura, p1. peso);
        System.out.printf("IMC: %.2f\n", p1.calcularIMC());
    }

}

