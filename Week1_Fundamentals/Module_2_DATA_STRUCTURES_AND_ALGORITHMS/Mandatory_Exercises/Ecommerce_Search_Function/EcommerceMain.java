public class EcommerceMain {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),

                new Product(102, "Phone", "Electronics"),

                new Product(103, "Shoes", "Fashion"),

                new Product(104, "Watch", "Accessories"),

                new Product(105, "Tablet", "Electronics")

        };

        Product result =
                SearchEngine.linearSearch(products,
                        "Watch");

        if(result != null) {

            System.out.println(result);

        }

        else {

            System.out.println("Product not found");

        }

    }

}
