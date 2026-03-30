package cl.duoc.formativa.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import cl.duoc.formativa.model.Product;

@Repository
public class ProductRepository {
    private final Map<Long, Product> productStore = new HashMap<>();

    public List<Product> findAll(){
        return new ArrayList<>(productStore.values());
    }

    public Optional<Product> findById(Long id){
        return Optional.ofNullable(productStore.get(id));
    }

    public Product save(Product product){
        productStore.put(product.getId(), product);
        return product;
    }

    public void deleteById(Long id){
        productStore.remove(id);
    }

    public boolean existsById(Long id){
        return productStore.containsKey(id);
    }

}
