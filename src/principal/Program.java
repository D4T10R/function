package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Product;
import util.FuctionProduct;

public class Program {

    public static void main(String[] args) {
        
        List<Product> produtos = new ArrayList<>();

        produtos.add(new Product("Tv", 900.0));
        produtos.add(new Product("Mouse", 50.0));
        produtos.add(new Product("Tablet", 350.50));
        produtos.add(new Product("HD Case", 80.0));

        // cria uma nova lista de string que; a lista produtos passa a ser uma stream que com o metodo .map adiciona uma funcão a essa stream depois o .collect(Collector.toList()) passa a stream para lista novamente
        // List<String> nomesProdutos = produtos.stream().map(new FuctionProduct()).collect(Collectors.toList());

        // REFERENCE METODO ESTATICO
        // List<String> nomesProdutos = produtos.stream().map(Product::staticApply).collect(Collectors.toList());

        // REFERENCE METODO NÃO ESTATICO
        // List<String> nomesProdutos = produtos.stream().map(Product::nonStaticApply).collect(Collectors.toList());

        // EXPRESÃO LAMBDA DECLARADA
        // Function<Product, String> function = p -> p.getNome().toUpperCase();
        
        // EXPRESÃO LAMBDA INLINE
        List<String> nomesProdutos = produtos.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());




        nomesProdutos.forEach(System.out::println);
        

    }

}