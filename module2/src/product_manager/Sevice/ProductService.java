package product_manager.Sevice;

import product_manager.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    public void create(Product product) {

        //region get lastId
        int lastId = 0;
        if (products.size() > 0) {
            lastId = products.get(products.size() - 1).getiD();
        }
        //endregion

        product.setiD(lastId + 1);
        products.add(product);

    }

    public List findAll() {
        return products;
    }

    public void delete(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getiD() == id) {
                products.remove(i);
                return;
            }
        }
    }

    public List searchByName(String name) {
        List result = new ArrayList();

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().contains(name)) {
                result.add(products.get(i));
            }
        }

        return result;
    }
}
