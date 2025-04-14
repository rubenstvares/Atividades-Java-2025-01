import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        String nome;
        double nota1, nota2, nota3, media;

        // Solicitando o nome e as notas do aluno
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();  // Lê o nome do aluno

        System.out.print("Digite a nota 1: ");
        nota1 = scanner.nextDouble();  // Lê a primeira nota

        System.out.print("Digite a nota 2: ");
        nota2 = scanner.nextDouble();  // Lê a segunda nota

        System.out.print("Digite a nota 3: ");
        nota3 = scanner.nextDouble();  // Lê a terceira nota

        // Calculando a média
        media = (nota1 + nota2 + nota3) / 3;

        // Exibindo o nome do aluno e a média das notas
        System.out.println("Aluno: " + nome);
        System.out.println("A média da sua nota é: " + media);

        // Fechando o scanner para liberar recursos
        scanner.close();
    }
}
