import java.util.Scanner;

public class SomaDePares {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite o seu Número:  ");

        int numeroInt = numero.nextInt();

        int somageral = 0;

        for(int i = 0; i <= numeroInt; i++){
            if(i % 2 == 0){
                somageral += i;
                System.out.println(i);
            }
        }
        System.out.println("Sua soma resulta em: " + somageral);
    }
}
