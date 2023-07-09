# Home Hair Care Inventory

O Home Hair Care Inventory é um sistema para gerenciar o estoque de produtos para cuidados com o cabelo e pele.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Swagger
- Gradle

## Configuração do Banco de Dados

O projeto utiliza o banco de dados H2 em memória para armazenar os dados. As configurações do banco de dados podem ser encontradas no arquivo `application.yml`.

- URL do Banco de Dados: jdbc:h2:mem:homehairdb
- Usuário: sa
- Senha: (em branco)

## Executando o Projeto

Para executar o projeto localmente, siga as etapas abaixo:

1. Clone o repositório para sua máquina local.
2. Navegue até o diretório do projeto: `cd home-hair-care-inventory`.
3. Execute o projeto usando o Gradle Wrapper: `./gradlew bootRun`.

O projeto será iniciado e estará disponível na URL `http://localhost:8080`.

## Documentação da API

A API do Home Hair Care Inventory é documentada usando o Swagger. A documentação da API pode ser acessada através da seguinte URL após iniciar o projeto:

- [Swagger UI](http://localhost:8080/swagger-ui.html)

A documentação fornece detalhes sobre os endpoints disponíveis, os modelos de dados esperados e as operações suportadas.

## Exemplo de Requisição POST

Você pode criar um novo produto enviando uma requisição POST para o endpoint `/api/produto`. Aqui está um exemplo de uma requisição usando o cURL:

```bash
curl -X POST -H "Content-Type: application/json" -d '{
  "nome": "Shampoo",
  "preco": 10.99,
  "quantidade": 20,
  "tamanho": 250,
  "validade": "2023-12-31",
  "localDeCompra": "Supermercado",
  "tipoProduto": "SHAMPOO",
  "marca": "Marca X",
  "descricao": "Descrição do produto",
  "dataCompra": "2023-07-03"
}' http://localhost:8080/api/produto
