import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductService
{
    List<Product> products = new ArrayList<>();

    ProductDb db = new ProductDb();

    public ProductService() throws SQLException {
    }

    public void addProduct(Product p)
    {
        db.save(p);
//        products.add(p);
    }

    public List<Product> getAllProducts()
    {
        return db.getAll();
//        return products;
    }

    public Product getProduct(String name)
    {
        for(Product p : products)
        {
            if(p.getName().equals((name)))
            {
                return p;
            }
        }
        return null;
    }

    public List<Product> getProductsWithText(String text)
    {
        List<Product> prods = new ArrayList<>();
        for(Product p : products)
        {
            if(p.getName().contains(text) || p.getType().contains(text) || p.getPlace().contains(text))
            {
                prods.add(p);
            }
        }
        return prods;
    }
}
