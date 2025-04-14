public class Atividade08 {
    public static void main(String[] args) {
        // Declaração das variáveis
        int num = 5;  // Número para a tabuada
        int cont = 1;  // Contador que vai de 1 a 10
        int result;  // Resultado da multiplicação

        // Laço while para imprimir os resultados da tabuada de 5
        while (cont <= 10) {
            result = num * cont;  // Calcula o resultado da multiplicação
            System.out.println("Resultado: " + result);  // Exibe o resultado
            cont++;  // Incrementa o contador
        }
    }
}

