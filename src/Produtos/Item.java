package Produtos;

public class Item {

    private String nome;
    private Integer  quantidade;
    private Double preco;

    public Item(String nome, int quantidade, Double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String toString() {
        return "Item: \n[" + nome.toUpperCase() + " Quantidade: " + quantidade + " Preço R$ " + String.format("%.2f", preco) + "]";
    }

}