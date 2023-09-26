package EX01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArvoreBinaria arvore = new ArvoreBinaria();

        while (true) {
            System.out.print("Digite um número (ou qualquer outro valor para sair): ");
            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();
                arvore.inserir(numero);
            } else {
                break;
            }
        }
        scanner.close();
    }
}