package br.dev.universos.shoppingcart.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RedisHash("carts")
public class Cart {
    @Id
    private Integer id;

    private List<Items> items;

    public Cart(Integer id) {
        this.id = id;
    }

    public List<Items> getItems() {
        if (items == null) {
            items = new ArrayList<>();
        }
        
        return items;
    }    
}
