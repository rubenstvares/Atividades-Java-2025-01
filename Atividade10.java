import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        String escolha;  // Variável para armazenar a escolha do usuário

        // Laço para continuar até o usuário escolher 'S'
        while (true) {
            // Exibe o menu para o usuário
            System.out.println("Digite: N Novo arquivo");
            System.out.println("Digite: A Abrir arquivo");
            System.out.println("Digite: F Fechar arquivo");
            System.out.println("Digite: S Para sair");

            // Lê a opção do usuário
            System.out.print("Digite sua opção: ");
            escolha = scanner.nextLine();

            // Verifica a escolha e exibe a mensagem correspondente
            switch (escolha.toUpperCase()) {
                case "N":
                    System.out.println("Novo arquivo criado com sucesso!");
                    break;
                case "A":
                    System.out.println("Abrindo arquivo!");
                    break;
                case "F":
                    System.out.println("Arquivo fechado com sucesso!");
                    break;
                case "S":
                    System.out.println("Obrigado por utilizar o sistema!");
                    scanner.close();  // Fecha o scanner antes de sair
                    return;  // Sai do programa
                default:
                    System.out.println("Valor incorreto, tente novamente.");
            }
        }
    }
}
