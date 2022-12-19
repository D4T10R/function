package entities;

public class Product {

    // ATRIBUTOS
    private String nome;
    private Double preco;
    // ATRIBUTOS

    // CONSTRUTORES
    public Product(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    // ENCAPSULAMENTO

    // METODOS
    public static String staticApply(Product p) {
        return p.getNome().toUpperCase();
    }

    public String nonStaticApply() {
        return getNome().toUpperCase();
    }
    
    
}
