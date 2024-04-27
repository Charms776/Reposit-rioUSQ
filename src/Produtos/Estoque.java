package Produtos;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Item> itens = new ArrayList<>();

    public void cadastrarItem(Item item) {
        itens.add(item);
        System.out.println("Item cadastrado com sucesso!");
    }


    public void listarItem() {
        if (itens.isEmpty()) {
            System.out.println("Nenhum item foi cadastrado.");
        } else {
            itens.forEach(i -> System.out.println(i));
        }
    }
}