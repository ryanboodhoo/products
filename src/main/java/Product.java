public class Product extends Products { // A class is a blueprint or template for making objects(products)
    //properties, attributes, fields, INSTANCE VARIABLES

    public Product(String nameOfProduct, double price) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }

    public Product(int quantityOfaProduct, double price, String nameOfProduct) {
        this.quantityOfaProduct = quantityOfaProduct;
        this.price = price;
        this.nameOfProduct = nameOfProduct;
    }

    //Define all things that an object (product) consists of
    public String nameOfProduct;
    public double price;
    int quantityOfaProduct;
    static int itemCount;
    int[] cartItems;



    //getter


    public int[] getCartItems() {
        return cartItems;
    }

    public void setCartItems(int[] cartItems) {
        this.cartItems = cartItems;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityOfaProduct() {
        return quantityOfaProduct;
    }

    public void setQuantityOfaProduct(int quantityOfaProduct) {
        this.quantityOfaProduct = quantityOfaProduct;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    //And thing that the objects/products can do
    public void printInfo (String nameOfProduct,double price, int quantityOfaProduct){
        System.out.println(nameOfProduct + "\n" + price + "\n" + quantityOfaProduct);  //printing the product's info





    }
}

