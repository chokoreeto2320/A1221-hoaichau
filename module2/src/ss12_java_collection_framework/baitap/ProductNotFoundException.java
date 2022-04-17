package ss12_java_collection_framework.baitap;

public class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message) {
        super(message);

    }
    public ProductNotFoundException(){
        super("khong tim thay san pham");
    }
}
