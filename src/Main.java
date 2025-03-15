//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Media de 3 números
        int num1 = 4;
        int num2 = 7;
        int num3 = 6;

        double media = (num1 + num2 +num3)/3.0;
        int media2 = (num1 + num2 +num3)/3;
        long media3 = (num1 + num2 +num3)/3L;

        System.out.println("A média do double é: " + media);
        System.out.println("A média do inteiro é: " + media2);
        System.out.println("A média do long é: " + media3);
        System.out.println();

        //Declaração de long
        long distancia = 149600000L;

        System.out.println("A distância da Terra ao Sol é: " + distancia + " km.");
        System.out.println();
    }
}