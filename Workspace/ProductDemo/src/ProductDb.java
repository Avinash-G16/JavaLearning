import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDb
{
    Connection con = null;
    public ProductDb() throws SQLException {
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/avinash","postgres","1999");
    }
    public void save(Product p)
    {
        String query = "insert into product (name, type, place, warranty) values (?,?,?,?)";
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1,p.getName());
            st.setString(2,p.getType());
            st.setString(3,p.getPlace());
            st.setInt(4,p.getWarranty());
            st.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Product> getAll()
    {
        List<Product> products = new ArrayList<>();

        String query = "select name, type, place, warranty from product";
        try{
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                Product p = new Product();
                p.setName(rs.getString(1));
                p.setType(rs.getString(2));
                p.setPlace(rs.getString(3));
                p.setWarranty(rs.getInt(4));
                products.add(p);
            }

        }
        catch(Exception ex) {
            throw new RuntimeException(ex);
        }

        return products;
    }
}
