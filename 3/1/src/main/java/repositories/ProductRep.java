package repositories;


import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductRep {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addProduct(Product product) {
        String sql = "INSERT INTO product VALUES (NULL, ?, ?)";
        jdbcTemplate.update(sql, product.getName(), product.getPrice());
    }


    public List<Product> getProducts() {
        String sql = " SELECT * FROM product";
        return jdbcTemplate.query(sql, new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setPrice(rs.getDouble("price"));
                return p;
            }
        });
    }
}
