package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    //metodo que me da o valor total dos produtos em estoque
    public double totalValueInStock() {
        return price * quantity;
    }

    //metodo para add produto
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    //metodo para remover produto
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    //mensagem final
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
