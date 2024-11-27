import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroA = new Random().nextInt(100);
        System.out.println("Digite um numero de 0 a 100");
        int numeroEscolhido = leitura.nextInt();

        for (int i = 0; i < 5; i++) {
            if (numeroEscolhido < numeroA) {
                System.out.println("o numero escolhido é maior");
                numeroEscolhido = leitura.nextInt();
            } else if (numeroEscolhido > numeroA){
                System.out.println("o numero escolhido é menor");
                numeroEscolhido = leitura.nextInt();
            } else {
                System.out.println("parabens acertou!");
                break;
            }

        }
    }
}