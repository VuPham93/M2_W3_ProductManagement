import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager_LinkedList {
    LinkedList<Product> products = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

    public void addProduct(Product newProduct) {
        products.add(newProduct);
    }

    public void editProduct(String id) {
        for (Product product : products) {
            if (id.equals(product.getId())) {
                product.setName(sc.nextLine());
            }
        }
    }

    public void deleteProduct(String id) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (id.equals(product.getId())) {
                products.remove(product);
            }
        }
    }

    public String findProduct(String name) {
        for (Product product : products) {
            if (name.equals(product.getName())) {
                return product.toString();
            }
        }
        return "Can't find the product";
    }

    public void displayProductList() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public void sortPriceLower() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return (int) (p1.getPrice() - (p2.getPrice()));
            }
        });
    }

    public void sortPriceHigher() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return (int) (p2.getPrice() - (p1.getPrice()));
            }
        });
    }
}
