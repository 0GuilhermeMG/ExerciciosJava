import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner peso = new Scanner(System.in);
        System.out.println("Digite o seu peso:  ");

        double pesoDouble = peso.nextDouble();

        Scanner altura = new Scanner(System.in);
        System.out.println("Digite sua altura:  ");

        double alturaDouble = altura.nextDouble();

        double IMC = pesoDouble / (alturaDouble * alturaDouble);

        if(IMC < 18.5 ){
            System.out.println("Abaixo do peso " + IMC);
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Peso Normal " + IMC);
        } else if (IMC >= 25.0 && IMC <= 29.9) {
            System.out.println("Sobrepeso " + IMC);
        } else if (IMC >= 30.0 && IMC <= 34.9) {
            System.out.println("Obesidade grau I " + IMC);
        } else if (IMC >= 35.0 && IMC <= 39.9) {
            System.out.println("Obesidade grau II " + IMC);
        } else if (IMC >= 40.0) {
            System.out.println("Obesidade grau III " + IMC);
        }


    }

}
