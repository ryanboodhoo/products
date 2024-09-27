public class Products {

        //DRY - Do not repeat yourself
        public static void main(String[] args) {


            //Make product1 and print the info
            Product product1 = new Product(5,10.00 ,"burger"); //default constructor
            System.out.println(product1);
            product1.nameOfProduct= "Burger";
            product1.price= 5.00;
            product1.quantityOfaProduct=5;
            product1.printInfo(product1.nameOfProduct ,product1.price, product1.quantityOfaProduct  );
                //Product 2
            Product product2 = new Product(5,1.00 ,"Fries");
            product2.nameOfProduct = " Fries";
            product2.price = 1.00;
            product2.quantityOfaProduct = 5;
            product2.printInfo(product2.nameOfProduct ,product2.price, product2.quantityOfaProduct  );

            //Instantiate objects
            //DataType object = new DataType();
            Product  product3 = new Product(5,0.50 ,"Soda"); // objects are created on the HEAP
            //objectName.propertyName;
            product3.nameOfProduct = "Soda";
            product3.price = .50;
            product3.quantityOfaProduct = 5;
              //objectName.methodName();
            product3.printInfo(product3.nameOfProduct ,product3.price, product3.quantityOfaProduct  );




        }


    }























/*
        String nameOfProduct = " watch";      //name of a product
        double price = 50.00;
        int quantityOfaProduct = 100;

        String nameOfProduct2 = "milk";      //name of a product
        double price2 = 5.00;
        int quantityOfaProduct2 = 10;

        //please create another product with name , price and qty ...also print out that product's info

        printInfo( nameOfProduct,   price,  quantityOfaProduct);

        System.out.println(" ");

        printInfo( nameOfProduct2,   price2,  quantityOfaProduct2);
 */

