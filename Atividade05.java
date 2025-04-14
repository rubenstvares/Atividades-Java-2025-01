import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int A, B, IvertidaA, IvertidaB;

        // Solicitando os valores para A e B
        System.out.print("Digite um número inteiro para A: ");
        A = scanner.nextInt();  // Lê o valor inteiro para A

        System.out.print("Digite um número inteiro para B: ");
        B = scanner.nextInt();  // Lê o valor inteiro para B

        // Efetuando a troca de valores
        IvertidaA = B;
        IvertidaB = A;

        // Exibindo os valores invertidos
        System.out.println("O número invertido de A: " + IvertidaA);
        System.out.println("O número invertido de B: " + IvertidaB);

        // Fechando o scanner para liberar recursos
        scanner.close();
    }
}

