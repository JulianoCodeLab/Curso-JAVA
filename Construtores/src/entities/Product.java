package entities;


public class Product {

    public String name;
    public double price;
    public int quantity;

    //-----------Obrigando o usuario a dar valores aos atributos=> construtor
    public Product(String name, double price, int quantity ){

        //referencia para o proprio objeto "this."
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //metodo que me da o valor total dos produtos em estoque
    public double totalValueInStock() {
        return price * quantity;
    }

    //metodo para add produto do estoque
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    //metodo para remover produto do estoque
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    //mensagem final com os valores modificados
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}