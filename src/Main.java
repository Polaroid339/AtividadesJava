public class Main {
    public static void main(String[] args) {

        //Media de 3 numeros
        int num1 = 4;
        int num2 = 7;
        int num3 = 6;

        double media = (num1 + num2 +num3)/3.0;
        int media2 = (num1 + num2 +num3)/3;
        long media3 = (num1 + num2 +num3)/3L;

        System.out.println("A média do double é: " + media);
        System.out.println("A média do inteiro é: " + media2);
        System.out.println("A média do long é: " + media3);
        System.out.println("-------------------------------------------------");


        //Declaração de long
        long distancia = 149600000L;

        System.out.println("A distância da Terra ao Sol é: " + distancia + " km.");
        System.out.println("-------------------------------------------------");


        //Valor Unicode de um caractere
        char letra = 'V'; //char é representado por aspas simples ''
        int valorUnicode = letra; //a variável inteira recebe o valor de V na tabela unicode

        System.out.println("O valor Unicode de '" + letra + "' é: " + valorUnicode);
        System.out.println("-------------------------------------------------");


        //Tipos Booleanos
        //true e false em java começam com letra minuscula
        int numero = 15;
        boolean maiorQueDez = numero > 10; //true

        System.out.println("O número " + numero + " é maior que 10? " + maiorQueDez);
        System.out.println("-------------------------------------------------");


        //Usando arrays (listas)
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Primeiro número: " + numeros[0]);
        System.out.println("Terceiro número: " + numeros[2]);
        System.out.println("Último número: " + numeros[numeros.length - 1]);
        System.out.println("-------------------------------------------------");


        //Calculando Area de um retângulo
        double altura = 3.0;
        double largura = 3.0;
        double area = altura * largura;

        System.out.println("A área do retângulo é: " + area);
        System.out.println("-------------------------------------------------");


        //Trabalhando com Strings e Dados multivalorados
        //String em java começa com S maiusculo
        String nome = "Victor";
        int idade = 21;
        double peso = 50.0;

        System.out.println("Olá, meu nome é " + nome + " tenho " + idade + " anos e peso " + peso + "kg.");
        System.out.println("-------------------------------------------------");


        //Verificando par ou impar
        int numeroVerificar = 8;

        if (numeroVerificar % 2 == 0) {
            System.out.println("O numero " + numeroVerificar + " é par");
        }
        else {
            System.out.println("O numero " + numeroVerificar + " é impar");
        }

    }
}