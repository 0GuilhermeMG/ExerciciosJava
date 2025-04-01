import java.util.Scanner;

public class CalculoDeMédia {
    public static void main(String[] args) {
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Digite o seu primeiro Número:  ");

        double numero1Double = numero1.nextDouble();

        Scanner numero2 = new Scanner(System.in);
        System.out.println("Digite o seu segundo Número:  ");

        double numero2Double = numero2.nextDouble();

        Scanner numero3 = new Scanner(System.in);
        System.out.println("Digite o seu terceiro Número:  ");

        double numero3Double = numero3.nextDouble();

        double media = (numero1Double + numero2Double + numero3Double) / 3;

        if (media >= 7){
            System.out.println("Aprovado!!!");
            return;
        }

        System.out.println("Reprovado :(");
    }
}
