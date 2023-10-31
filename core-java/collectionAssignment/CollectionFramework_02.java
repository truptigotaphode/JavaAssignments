package collectionAssignment;
import java.util.*;


public class CollectionFramework_02 {
	public static void main(String[] args) {
		
	        ProductStore store = new ProductStore();

	        store.addProduct(1,"Bucket");
	        store.addProduct(2,"Chair");
	        store.addProduct(3,"Bedsheet");
	        store.addProduct(4,"Bottle");
	        store.addProduct(5,"Clothes");
	        store.addProduct(6,"stand");
	        store.addProduct(7,"Pot");
	        store.addProduct(8,"Desk");
	        store.addProduct(9,"bulb");
	        store.addProduct(10,"bulb");

	        
	        store.addProduct( 7,"Pot");

	        store.displayProducts();
		}
}


class Product {
    private int id;
    private String item;

    public Product(int id, String item) {
        this.id = id;
        this.item = item;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        Product other = (Product) obj;
        return id == other.id && item.equals(other.item);
    }

    @Override
    public String toString() {
        return "Product:" +"id=" + id + ", item='" + item + '\'';
            
    }
}

class ProductStore {
    private HashSet<Product> products = new HashSet<>();

    public void addProduct(int id, String item) {
        Product newProduct = new Product(id, item);
        if (products.contains(newProduct)) {
            System.out.println("Duplicate product rejected: " + newProduct);
        } else {
            products.add(newProduct);
        }
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}



