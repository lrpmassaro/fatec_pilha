package pilha;

public class Pilhas {

    private int elementos[];
    private int topo;

    public Pilhas(int tam) {

        elementos = new int[tam];
        topo = -1;
    }

    public int push(int elem) {

        if (topo == elementos.length - 1) {
            System.out.println("\nPilha cheia! Não é possível inserir novos elementos.");
            return -1;
        } else {
            System.out.println("\nValor inserido com sucesso!");
            topo++;
            elementos[topo] = elem;
            return 1;
        }
    }

    public int pop() {

        int e;

        if (topo == -1) {
            System.out.println("\nPilha vazia!");
            return -1;
        } else {
            e = elementos[topo];
            topo--;
            System.out.println("\nDado do topo removido!");
            return e;
        }
    }

    public void listar() {

        if (topo == -1) {
            System.out.println("\nPilha vazia! Não é possível listar dados.");

        } else {
            System.out.println("\nDados digitados: ");
            for (int i = 0; i <= topo; i++) {
                System.out.print(elementos[i]);
            }
        }
    }

    public void dadotopo() {

        if (topo == -1) {
            System.out.println("\nPilha vazia! Não é possível exibir dado do topo.");

        } else {
            System.out.println("\nDado do topo: " + elementos[topo]);
        }
    }

    public void quantidade() {
        System.out.println("\nQuantidade de elementos: " + (topo + 1));
    }

    public void remover() {
        if (topo == -1) {
            System.out.println("\nPilha vazia!");
        } else {
            while (topo != -1) {
                topo--;
            }
        }
        System.out.println("\nDados apagados!");
    }
}
