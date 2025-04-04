// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria o objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o primeiro parâmetro
        System.out.print(" Digite o primeiro parâmetro:  ");
        int parametroUm = scanner.nextInt();

        // Solicita o segundo parâmetro
        System.out.print(" Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        try {
            // Chama o método contar da classe Contador
            Contador.contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Captura e imprime a exceção caso o primeiro parâmetro seja maior que o segundo
            System.out.println(e.getMessage());
        } finally {
            // Fecha o scanner
            scanner.close();
        }
    }
}
