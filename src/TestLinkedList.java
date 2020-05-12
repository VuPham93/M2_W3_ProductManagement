public class TestLinkedList {
    public static void main(String[] args) {
        Product product1 = new Product("L01", "Iphone", 10000);
        Product product2 = new Product("L02", "Nokia", 8000);
        Product product3 = new Product("L03", "Huawei", 20000);
        Product product4 = new Product("L04", "Xiaomi", 30000);
        Product product5 = new Product("L05", "Samsung", 100000);

        ProductManager_LinkedList productsLinkedList = new ProductManager_LinkedList();
        productsLinkedList.addProduct(product4);
        productsLinkedList.addProduct(product3);
        productsLinkedList.addProduct(product1);
        productsLinkedList.addProduct(product2);
        productsLinkedList.addProduct(product5);

        System.out.println("\nProduct list: ");
        productsLinkedList.displayProductList();

        System.out.println("\nProduct after sorted from lower price: ");
        productsLinkedList.sortPriceLower();
        productsLinkedList.displayProductList();

        System.out.println("\nProduct after sorted from higher price: ");
        productsLinkedList.sortPriceHigher();
        productsLinkedList.displayProductList();

        System.out.println("\nEdit product L01's name: ");
        productsLinkedList.editProduct("L01");
        productsLinkedList.displayProductList();

        System.out.println("\nFind product Samsung ");
        System.out.println(productsLinkedList.findProduct("Samsung"));

        System.out.println("\nDelete product L04");
        productsLinkedList.deleteProduct("L04");
        productsLinkedList.displayProductList();


    }
}
