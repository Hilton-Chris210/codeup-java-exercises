public class Product {
    /* TODO: create a class called Product with two private properties of name and priceInCents.
    Add a public static method called, find average price that takes in an array of products
    and finds the average price of all products. Add a main method to the class to test some
    values.
    */

    private String name;
    private int priceInCents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

    public Product(String name, int priceInCents) {
        this.name = name;
        this.priceInCents = priceInCents;
    }

   public static double findAveragePrice(Product[] products) {
            double sum = 0;
            for (Product product : products) {
                sum += product.getPriceInCents();
            }
            return sum / products.length;
        }


    public static void main(String[] args) {
        Product product1 = new Product("apple", 100);
        Product product2 = new Product("orange", 200);
        Product product3 = new Product("banana", 300);
        Product product4 = new Product("grape", 400);
        Product product5 = new Product("watermelon", 500);
        Product[] products = {product1, product2, product3, product4, product5};
        System.out.println(findAveragePrice(products));
        products[0].setName("test");
        System.out.println(products[0].getName());
    }



}
