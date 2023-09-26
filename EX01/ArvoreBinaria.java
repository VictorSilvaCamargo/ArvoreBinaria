package EX01;

class ArvoreBinaria {
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
}