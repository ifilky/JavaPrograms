import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        // criando um objeto da classe random
        Random random = new Random();

        // criando um objeto da classe scanner
        Scanner leitor = new Scanner(System.in);

        // gerando um número aleatório inteiro entre 0 e 100
        int numeroCorreto = random.nextInt(100);

        for (int i = 1; i <= 5; i++) {
            System.out.println("""               
                     *********JOGO DA ADVINHAÇÃO*********
                     
                     DIGITE UM NÚMERO INTEIRO DE 0 A 100 
                     PARA ADIVINHAR OU QUALQUER OUTRO 
                     NÚMERO PARA DEIXAR O JOGO:
                     
                     ************************************
                    """);
            int numeroEscolhido = leitor.nextInt();

            if (numeroEscolhido < 0 || numeroEscolhido > 100) {
                break;
            } else if (numeroEscolhido > numeroCorreto) {
                System.out.println("Número errado! O número correto é menor!");
            } else if (numeroEscolhido < numeroCorreto) {
                System.out.println("Número errado! O número correto é maior!");
            } else System.out.println("Parabéns! Número Correto! Quantidade de tentativas: " + i);
        }
    }
}

