package br.dev.universos.shoppingcart.repositories;

import org.springframework.data.repository.CrudRepository;
import br.dev.universos.shoppingcart.models.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {
    
}
