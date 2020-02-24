package repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProductRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public  void  addProduct(String name){
        String query="Insert into product values(NULL,?)";
        jdbcTemplate.update(query,name);
    }

}
