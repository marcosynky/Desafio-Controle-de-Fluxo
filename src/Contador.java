// Contador.java
import java.util.Scanner;

public class Contador {

    // Método que valida os parâmetros e faz a contagem
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            // Lança exceção personalizada
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcula a quantidade de iterações
        int quantidadeInteracoes = parametroDois - parametroUm;

        // Realiza o laço de iteração e imprime as mensagens
        for (int i = 1; i <= quantidadeInteracoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
