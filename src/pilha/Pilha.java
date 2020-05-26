package pilha;

import java.util.Scanner;

public class Pilha {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Pilhas dados;
        int tam, e;
        int op;

        System.out.print("Tamanho da pilha: ");
        tam = ent.nextInt();

        dados = new Pilhas(tam);

        do {
            System.out.println("\nMENU");
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Listar");
            System.out.println("4 - Exibir dado do topo");
            System.out.println("5 - Exibir quantidade de elementos");
            System.out.println("6 - Apagar todos os dados");
            System.out.println("7 - Sair");
            System.out.print("Opção = ");

            op = ent.nextInt();

            switch (op) {
                case 1:
                    System.out.print("\nInsira um valor na pilha: ");
                    e = ent.nextInt();
                    dados.push(e);
                    break;

                case 2:
                    dados.pop();
                    break;

                case 3:
                    dados.listar();
                    break;

                case 4:
                    dados.dadotopo();
                    break;

                case 5:
                    dados.quantidade();
                    break;

                case 6:
                    dados.remover();
                    break;

                case 7:
                    System.out.print("\nPrograma finalizado!");
                    break;

                default:
                    System.out.print("\nOpção inválida!");
            }
        } while (op != 7);
    }
}
