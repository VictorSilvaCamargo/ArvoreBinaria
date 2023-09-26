package EX05;


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

    public void removerMaior() {
        raiz = removerMaiorRecursivamente(raiz);
    }

    private Node removerMaiorRecursivamente(Node raiz) {
        if (raiz == null) {
            return null;
        } else if (raiz.direita == null) {
            System.out.println("Removendo o elemento: " + raiz.info);
            return raiz.esquerda;
        } else {
            raiz.direita = removerMaiorRecursivamente(raiz.direita);
            return raiz;
        }
    }

    public void removerMenor() {
        raiz = removerMenorRecursivamente(raiz);
    }

    private Node removerMenorRecursivamente(Node raiz) {
        if (raiz == null) {
            return null;
        } else if (raiz.esquerda == null) {
            System.out.println("Removendo o elemento: " + raiz.info);
            return raiz.direita;
        } else {
            raiz.esquerda = removerMaiorRecursivamente(raiz.esquerda);
            return raiz;
        }
    }

    public void remover(int valor) {
        raiz = removerRecursivamente(raiz, valor);
    }

    private Node removerRecursivamente(Node raiz, int valor) {
        if (raiz == null) {
            return null;
        }

        if (valor < raiz.info) {
            raiz.esquerda = removerRecursivamente(raiz.esquerda, valor);
        } else if (valor > raiz.info) {
            raiz.direita = removerRecursivamente(raiz.direita, valor);
        } else {

            if (raiz.esquerda == null && raiz.direita == null) {
                return null;
            }

            else if (raiz.esquerda == null) {
                return raiz.direita;
            } else if (raiz.direita == null) {
                return raiz.esquerda;
            }

            else {
                Node menorNoDireita = encontrarMenor(raiz.direita);
                raiz.info = menorNoDireita.info;
                raiz.direita = removerRecursivamente(raiz.direita, menorNoDireita.info);
            }
        }

        return raiz;
    }

    private Node encontrarMenor(Node raiz) {
        while (raiz.esquerda != null) {
            raiz = raiz.esquerda;
        }
        return raiz;
    }
}
