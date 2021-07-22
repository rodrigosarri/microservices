
# Projeto de Microsserviços

Esse é um projeto desenvolvimento entendimento de microsserviços como parte do aprendizado no curso **Santander Bootcamp | Fullstack Developer** promovido pela *Digital Innovation One*

O projeto é dividido em três partes
- Um projeto de configuração para gerenciar os projetos de cadastro de produto e adição do produto em um carrinho de compra
- Um projeto de cadastro de produto utilizando ElasticSearch
- Um projeto de adicionar o produto no carrinho de compra utilizando Redis

## Pré-requisitos

- Java 11.0.0
- Apache Maven 3.8.1


## Instalação

```console
git clone https://github.com/rodrigosarri/microservices.git
cd microservices/config-server
mvn clean install
mvn spring-boot:run
```

Após executar o projeto de configuração do servidor poderão ser executados os demais projetos dentro do repósitorio

```console
cd microservices/product
mvn clean install
mvn spring-boot:run
```

```console
cd microservices/shopping-cart
mvn clean install
mvn spring-boot:run
```

## ElasticSearch
Para utilizar o ElasticSearch, é necessário realizar o download através do [link:](https://www.elastic.co/pt/downloads/elasticsearch) e executar conforme orientação do sistema operacional.
OBS: Também é possível rodar através de um docker

## Redis
Para utilizar o Redis, é necessário realizar o download através do [link:](https://redis.io/download), realizar a instalação e executar conforme orientação do sistema operacional.
OBS: Também é possível rodar através de um docker

## Contribuindo 
Solicitações pull são bem-vindas. Para mudanças importantes, abra um problema primeiro para discutir o que você gostaria de mudar.

Certifique-se de atualizar os testes conforme apropriado. 

## Licença
[MIT](https://choosealicense.com/licenses/mit/)
