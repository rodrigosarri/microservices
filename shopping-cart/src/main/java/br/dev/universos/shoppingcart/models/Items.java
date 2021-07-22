package br.dev.universos.shoppingcart.models;

import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RedisHash("items")
public class Items {
    
    private Integer productId;
    private Integer amount;

}
