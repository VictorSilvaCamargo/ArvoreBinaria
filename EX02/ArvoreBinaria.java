package EX02;

public class ArvoreBinaria {
    Node raiz;

    public void inserir(int info) {
        raiz = inserirRecursivamente(raiz, info);
    }

    private Node inserirRecursivamente(Node raiz, int info) {
        if (raiz == null) {
            raiz = new Node(info);
            return raiz;
        }

        if (info < raiz.info) {
            raiz.esquerda = inserirRecursivamente(raiz.esquerda, info);
        } else if (info >= raiz.info) {
            raiz.direita = inserirRecursivamente(raiz.direita, info);
        }

        return raiz;
    }

    public void preOrdem(Node node) {
        if (node == null) return;

        System.out.print(node.info + " ");
        preOrdem(node.esquerda);
        preOrdem(node.direita);
    }

    public void inOrdem(Node node) {
        if (node == null) return;

        inOrdem(node.esquerda);
        System.out.print(node.info + " ");
        inOrdem(node.direita);
    }

    public void posOrdem(Node node) {
        if (node == null) return;

        posOrdem(node.esquerda);
        posOrdem(node.direita);
        System.out.print(node.info + " ");
    }
}