public class TestArrayList {
    public static void main(String[] args) {
        Product product1 = new Product("p01", "Iphone", 10000);
        Product product2 = new Product("p02", "Nokia", 8000);
        Product product3 = new Product("p03", "Huawei", 20000);
        Product product4 = new Product("p04", "Xiaomi", 30000);
        Product product5 = new Product("p05", "Samsung", 100000);

        ProductManager_ArrayList productsArray = new ProductManager_ArrayList();
        productsArray.addProduct(product4);
        productsArray.addProduct(product3);
        productsArray.addProduct(product1);
        productsArray.addProduct(product2);
        productsArray.addProduct(product5);

        System.out.println("\nProduct list: ");
        productsArray.displayProductList();

        System.out.println("\nProduct after sorted from lower price: ");
        productsArray.sortPriceLower();
        productsArray.displayProductList();

        System.out.println("\nProduct after sorted from higher price: ");
        productsArray.sortPriceHigher();
        productsArray.displayProductList();

        System.out.println("\nEdit product p01's name: ");
        productsArray.editProduct("p01");
        productsArray.displayProductList();

        System.out.println("\nFind product Samsung ");
        System.out.println(productsArray.findProduct("Samsung"));

        System.out.println("\nDelete product p04");
        productsArray.deleteProduct("p04");
        productsArray.displayProductList();


    }
}
