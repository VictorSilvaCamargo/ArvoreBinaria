package EX04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArvoreBinaria arvore = new ArvoreBinaria();


        while (true) {
            System.out.print("Digite um número (ou qualquer outro valor para sair): ");
            int numero = scanner.nextInt();
            if (numero != -1) {
                arvore.inserir(numero);
            } else {
                break;
            }
        }



        System.out.println("\nPercorrendo em Pré-Ordem:");
        arvore.preOrdem(arvore.raiz);

        System.out.println("\nPercorrendo em Inordem:");
        arvore.inOrdem(arvore.raiz);

        System.out.println("\nPercorrendo em Pós-Ordem:");
        arvore.posOrdem(arvore.raiz);

        System.out.println("\n Removendo o menor elemento:");
        arvore.removerMenor();

    }
}
