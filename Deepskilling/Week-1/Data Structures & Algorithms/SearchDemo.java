class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class SearchDemo {

    static int linearSearch(Product[] products, String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(name))
                return i;
        }
        return -1;
    }

    static int binarySearch(Product[] products, String name) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int result = products[mid].productName.compareToIgnoreCase(name);

            if (result == 0)
                return mid;
            else if (result < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mouse", "Electronics"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Shoes", "Fashion")
        };

        int index = linearSearch(products, "Phone");
        if (index != -1)
            System.out.println("Linear Search: " + products[index].productName + " Found");
        else
            System.out.println("Product Not Found");

        Product[] sortedProducts = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mouse", "Electronics"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Shoes", "Fashion")
        };

        index = binarySearch(sortedProducts, "Phone");
        if (index != -1)
            System.out.println("Binary Search: " + sortedProducts[index].productName + " Found");
        else
            System.out.println("Product Not Found");
    }
}