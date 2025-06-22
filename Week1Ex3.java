import java.util.Arrays;
public class Week1Ex3 {
    public static void main(String[] args) {
        SearchProduct[] products = {
            new SearchProduct(1, "Laptop", "Electronics"),
            new SearchProduct(2, "Mouse", "Accessories"),
            new SearchProduct(3, "Keyboard", "Accessories"),
            new SearchProduct(4, "Monitor", "Electronics"),
            new SearchProduct(5, "Camera", "Photography")
        };

        // Linear Search Example
        String searchKey1 = "Keyboard";
        int index1 = SearchEngine.linearSearch(products, searchKey1);
        System.out.println("Linear Search: " + (index1 != -1 ? "Found at index " + index1 : "Not Found"));

        // Sort array before Binary Search
        Arrays.sort(products, (a, b) -> a.productName.compareToIgnoreCase(b.productName));

        // Binary Search Example
        String searchKey2 = "Camera";
        int index2 = SearchEngine.binarySearch(products, searchKey2);
        System.out.println("Binary Search: " + (index2 != -1 ? "Found at index " + index2 : "Not Found"));
    }
}
class SearchProduct {
    int productId;
    String productName;
    String category;

    SearchProduct(int id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }
}

class SearchEngine {
    static int linearSearch(SearchProduct[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].productName.equalsIgnoreCase(key)) return i;
        }
        return -1;
    }

    static int binarySearch(SearchProduct[] arr, String key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int comp = arr[mid].productName.compareToIgnoreCase(key);
            if (comp == 0) return mid;
            else if (comp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}