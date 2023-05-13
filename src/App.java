import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o 1º numero inteiro");
        int primeiroNumero = teclado.nextInt();
        System.out.println("Digite o 2º numero inteiro");
        int segundoNumero = teclado.nextInt();
        System.out.println("Digite o 3º numero real");
        double numeroReal = teclado.nextDouble();
        teclado.close();

        int resultado1 = primeiroNumero * 2 + (int) (segundoNumero / 2);
        double resultado2 = primeiroNumero * 3 + numeroReal;
        double resultado3 = Math.pow(numeroReal, 3);

        System.out.printf("O produto do dobro do primeiro com metade do segundo é: %d\n", resultado1);
        System.out.printf("A soma do triplo do primeiro com o terceiro é: %.2f\n", resultado2);
        System.out.printf("O terceiro elevado ao cubo é: %.2f\n", resultado3);

    }
}
