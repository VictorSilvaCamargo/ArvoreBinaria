package EX05;

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

        //System.out.println("\nRemovendo o maior elemento:");
        //arvore.removerMaior();

        //System.out.println("\n Removendo o menor elemento:");
        //arvore.removerMenor();

        System.out.println("\n Insira o numero que voce quer remover: ");
        int numero2 = scanner.nextInt();
        arvore.remover(numero2);
        scanner.close();

        arvore.preOrdem(arvore.raiz);
    }
}

