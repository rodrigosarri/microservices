package br.dev.universos.product.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "br.dev.universos.product.repositories")
public class ElasticSearchConfig extends AbstractElasticsearchConfiguration {
  
    @Override
    public RestHighLevelClient elasticsearchClient() {
        ClientConfiguration clientConfiguration = (ClientConfiguration) ClientConfiguration.builder()
        .connectedTo("localhost:9200", "localhost:9300")
        .build();
        return RestClients.create(clientConfiguration).rest();
    }

}
