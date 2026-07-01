public class ECommerceSearch {
    public static int linearSearch(String[] products, String target) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] products = {"Laptop", "Smartphone", "Tablet", "Headphones", "Monitor"};
        String target = "Headphones";

        int index = linearSearch(products, target);
        if (index != -1) {
            System.out.println("Product found at index: " + index);
        } else {
            System.out.println("Product not found.");
        }
    }
}
