package br.dev.universos.product.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import br.dev.universos.product.models.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findByName(String name);
}
