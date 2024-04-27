package Main;

import Produtos.Estoque;
import Produtos.Item;

import java.util.Scanner;

public class Main {

    static Estoque estoque = new Estoque();
    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        boolean executando = true;
        while (executando) {
           var opcao = iniciar();
           if (opcao == 3) {
               executando = false;
           }
           else {
               executarAcao(opcao);
           }
        }
    }

    public static Integer iniciar() {
        System.out.println("\n Escolha uma opção: \n");
        System.out.println("(°1) Cadastrar Item ");
        System.out.println("(°2)Listar Itens ");
        System.out.println("(°3) Sair ");

        int opcao = scanner.nextInt();
        return opcao;
    }

    public static void executarAcao(Integer opcao) {
        switch(opcao) {
            default:
                System.out.println(" Opção Inválida!");
            case 1:
                estoque.cadastrarItem(criarItem());
                break;
            case 2:
                estoque.listarItem();
                break;
        }
    }

    public static Item criarItem() {
        System.out.println("Nome do Item: ");
        String nome = scanner.next();
        System.out.println("Quantidade do item: ");
        int quantidade = scanner.nextInt();
        System.out.println("Preço do item: ");
        double preco = scanner.nextDouble();
        return new Item(nome, quantidade, preco);
    }
}
