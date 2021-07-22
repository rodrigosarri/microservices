package br.dev.universos.product.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(indexName = "products")
public class Product {
    
    @Id
    private Integer id;

    private String name;

    private Integer amount;
}
