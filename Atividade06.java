import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        String nome;
        double salario, vendas, salarioFinal;

        // Solicitando os dados ao usuário
        System.out.print("Digite o nome do funcionário: ");
        nome = scanner.nextLine();  // Lê o nome do vendedor

        System.out.print("Digite o valor do salário fixo: ");
        salario = scanner.nextDouble();  // Lê o salário fixo

        System.out.print("Digite o valor das vendas efetuadas: ");
        vendas = scanner.nextDouble();  // Lê o valor das vendas

        // Calculando o salário final
        salarioFinal = (vendas * 0.15) + salario;  // 15% de comissão sobre as vendas

        // Exibindo os resultados
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário final é: " + salarioFinal);

        // Fechando o scanner para liberar recursos
        scanner.close();
    }
}
