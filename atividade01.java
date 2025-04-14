//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        double num1, num2, resultado;

        // Inicializando os valores diretamente (como no pseudocódigo fornecido)
        num1 = 10;
        num2 = 5;

        // Calculando a soma
        resultado = num1 + num2;

        // Exibindo o resultado
        System.out.println("A soma é: " + resultado);

        // Fechando o scanner (não necessário neste caso, mas é uma boa prática)
        scanner.close();
    }
}
