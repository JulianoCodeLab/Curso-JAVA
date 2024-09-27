package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;


public class Program {

    public static void main(String[] args) {
        //definindo contador americando
        Locale.setDefault(Locale.US);

        //instanciando um novo scanner
        Scanner sc = new Scanner(System.in);

        //instanciando um novo objeto da classe product
        Product product = new Product();

        System.out.println("Enter product data: ");

        //criando um novo item no estoque com nome preço e quantidade
        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        //pulando linha
        System.out.println();
        System.out.println("Product data: " + product);

        //pulando linha
        System.out.println();

        // adicionando mais unidades do produto no estoque
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        //pulando linha
        System.out.println();

        System.out.println("Updated data: " + product);
        System.out.println();

        //opção de remover quantidades de produto do estoque
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        //pulando linha
        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
}