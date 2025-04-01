import java.util.Scanner;

public class NumeroImparPar {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite o seu Numero para verificação:  ");

        double numeroDouble = numero.nextDouble();

        double verificar = numeroDouble % 2;

        if(verificar == 0){
            System.out.println("Número é par! ");
            return;
        }
        System.out.println("Número é ímpar");
    }
}
