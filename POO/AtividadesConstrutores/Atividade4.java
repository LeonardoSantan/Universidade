
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

public class Atividade4 {
    public static class Pessoa {
        String nome;
        double altura;
        double peso;

        public Pessoa() {
            nome = "Fulano";
            altura = 1.80;
            peso = 80;

        }

        public Pessoa(String x, double y, double z) {
            nome = x;
            altura = y;
            peso = z;
        }

        public double calcularIMC() {
            double imc = peso / (altura * altura);
            return imc;
        }

        public String classificacaoIMC() {
            double imc = calcularIMC();
            String valor = null;
            if (imc < 18.5) {
                valor = "Magreza";
            }
            if (imc >= 18.5 && imc <= 24.9) {
                valor = "Normal";
            }
            if (imc >= 25 && imc <= 29.9) {
                valor = "Sobrepeso";
            }
            if (imc >= 30 && imc <= 34.9) {
                valor = "Obesidade grau I";
            }
            if (imc >= 35 && imc <= 39.9) {
                valor = "Obesidade grau II";
            }
            if (imc >= 40) {
                valor = "Obesidade grau III";
            }
            return valor;
        }
    }

    //Método para avaliar o IMC da pessoa e retornar a classificação correspondente:
// - declare um médodo público chamado classificacaoIMC().
// - a informação retornada deve seguir a tabela abaixo:
//
//IMC	Classificação
//Menor que 18,5	Magreza
//18,5 a 24,9	Normal
//25 a 29,9	Sobrepeso
//30 a 34,9	Obesidade grau I
//35 a 39,9	Obesidade grau II
//Maior que 40	Obesidade grau III
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Aluno de Poo", 1.80, 75);
        System.out.printf("Nome: %s, Altura: %.2f, Peso: %.2f\n", p1.nome, p1.altura, p1.peso);
        System.out.printf("IMC: %.2f\n", p1.calcularIMC());
        System.out.printf("Classificação: %s\n", p1.classificacaoIMC());
    }
}


